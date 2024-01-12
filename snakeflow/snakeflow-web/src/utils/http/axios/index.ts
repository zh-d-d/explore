import axios, {AxiosInstance, AxiosRequestConfig, AxiosResponse} from "axios";
import {merge} from "lodash";

interface CustomSuccessData<T> {
    code: number;
    msg?: string;
    data?: T;
}

interface IAxiosGet {
    <T = any>(url: string, params?: Record<string, any>, config?: AxiosRequestConfig | null): Promise<CustomSuccessData<T>>
}

interface IAxiosPostOrPutOrDelete {
    <T = any>(url: string, data?: Record<string, any>, config?: AxiosRequestConfig): Promise<T>
}

function createService() {
    //创建实例
    const service = axios.create()

    //请求拦截
    service.interceptors.request.use((config) => {
        return config
    }, (error) => {
        Promise.reject(error)
    })

    //响应拦截
    service.interceptors.response.use((res: AxiosResponse) => {
        return Promise.resolve(res.data.data)
    }, error => {
        return Promise.reject(error)
    })


    return service
}

const createDefaultConfig = () => {
    return {
        headers: {
            "Content-Type": "application/json",
            "Authorization": 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2dpblR5cGUiOiJsb2dpbiIsImxvZ2luSWQiOjE1Njc3MzgwNTI0OTIzNDEyNDksInJuU3RyIjoiUkFLT0VIdEltd0dRdUoySGppMVBaMktGODFkbjcwSFciLCJsb2dpblVzZXIiOnsiaWQiOjE1Njc3MzgwNTI0OTIzNDEyNDksInVzZXJOYW1lIjoic3VwZXJBZG1pbiIsInJlYWxOYW1lIjoi6LaF57qn566h55CG5ZGYIiwiYWRtaW5UeXBlIjoxLCJyb2xlSWRzIjpbXSwicm9sZU5hbWVzIjpbXSwicm9sZUNvZGVzIjpbXSwiZGVwdElkIjoxNzA0NzkyMTY5MTM1MDc5NDI2LCJkZXB0TmFtZSI6IuS4gOe6p-WtkOmDqOmXqCIsInBvc3RJZCI6MTcwNTAyNTIwNDQ4NTA0MjE3NywicG9zdE5hbWUiOiLmnrbmnoTluIgiLCJleHQiOnt9LCJhcHBDb2RlIjoicGxhdGZvcm0iLCJzdXBlckFkbWluIjp0cnVlfX0.-asT80DCFLIx3mlOi5JunEZ-W8fnkqS5w6U8vYslM94',
        },
        data: {}
    }
}

function createRequest(service: AxiosInstance) {
    return function <T>(config: AxiosRequestConfig): Promise<T> {
        const mergeConfig = merge(createDefaultConfig(), config)
        return service(mergeConfig);
    }
}


const service = createService()

export const request = createRequest(service)

export const get: IAxiosGet = (url, params, config) => {
    return service.get(url, {params, ...config})
}

export const post: IAxiosPostOrPutOrDelete = (url, data, config) => {
    const mergeConfig = merge(createDefaultConfig(), config)
    return service.post(url, data, mergeConfig)
}

export const put: IAxiosPostOrPutOrDelete = (url, data, config) => {
    const mergeConfig = merge(createDefaultConfig(), config)
    return service.put(url, data, mergeConfig)
}

// export const deleteRequest: IAxiosPostOrPutOrDelete = (url, data, config) => {
//     // const mergeConfig = merge(createDefaultConfig(), config)
//     // return service.delete(url, data, mergeConfig)
// }



