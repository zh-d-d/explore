import {ConfigEnv, defineConfig, UserConfigExport} from 'vite'
import vue from '@vitejs/plugin-vue'
import {resolve} from "path";

// https://vitejs.dev/config/
export default (configEnv: ConfigEnv): UserConfigExport => {
    return {
        resolve: {
            alias: {
                //
                '@': resolve(__dirname, './src')
            }
        },
        server: {
            /** 设置 host: true 才可以使用 Network 的形式，以 IP 访问项目 */
            host: true,
            /** 是否自动打开浏览器 */
            open: false,
            cors: true,
            proxy: {
                '/api': {
                    target: 'http://localhost:18080',
                    changeOrigin: true,
                    rewrite: (path) => path.replace(/^\/api/, '')
                }
            }
        },
        plugins: [vue()]
    }
}
