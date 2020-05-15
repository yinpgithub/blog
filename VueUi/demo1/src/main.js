import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'
Vue.config.productionTip = false
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(ElementUI)
Vue.use(VueRouter)

//1`创建组件
import login from './views/login.vue'
import index from './views/index.vue'
import user from './views/user.vue'
//2`配置路由
const routes = [
  {path: '/login',component:login},
  {path: '/',component:index},
  {path: '/index',component:index},
  {path: '/user',component:user}
]
//3`实例化vuerouter
const router = new VueRouter({
  routes
})
// 4 挂载
new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
