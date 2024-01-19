import Login from "@/views/Login/Login.vue";
import Home from "@/views/Home/Home.vue";
import App from "@/App.vue";
import {createRouter, createWebHashHistory, createWebHistory, RouteRecordRaw, RouterOptions} from "vue-router";


export const constantRoutes: RouteRecordRaw[] = [
    {
        path: "/login",
        component: Login,
    } as RouteRecordRaw,
    {
        path: '/home',
        component: Home
    },
    {
        path: '/',
        component: App,
        redirect: '/login'
    }
]

const router = createRouter({
    history:
        import.meta.env.VITE_ROUTER_HISTORY === "hash"
            ? createWebHashHistory(import.meta.env.VITE_PUBLIC_PATH)
            : createWebHistory(import.meta.env.VITE_PUBLIC_PATH),
    routes: constantRoutes
} as RouterOptions)

export default router
