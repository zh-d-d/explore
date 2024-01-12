import {post} from "@/utils/http/axios";

export interface DeptUser {
    disabled: boolean
    ext: {}
    label: string
    nodeType: string
    value: string,
    children: DeptUser[]
}


export function getDeptUserTree():Promise<DeptUser[]> {
    return post<DeptUser[]>('/api/sys/user/getDeptUserTree')
}

