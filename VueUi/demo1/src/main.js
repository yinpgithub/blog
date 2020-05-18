import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'
Vue.config.productionTip = false
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import axios from 'axios';
import VueCookies from 'vue-cookies'


Vue.use(ElementUI)
Vue.use(VueRouter)
Vue.use(VueCookies)

Vue.prototype.$http = axios;

//1`创建组件
import login from './views/login.vue'
import home from './views/home.vue'
import user from './views/user.vue'
import index from './views/index.vue'
import error from './views/error.vue'

//2`配置路由
const routes = [
  {path:'/',redirect: '/home.html',component:index,children: [
    {path: '/home.html',component:home},
    {path: '/user.html',component:user}
  ]},
  {path: '/login.html',component:login},
  {path: '/error.html',component:error}
]
//3`实例化vuerouter
const router = new VueRouter({
  mode:"history",
  routes
})
router.beforeEach((to, from, next) => {
  next()
  // console.log(.getCookie("JSESSIONID"));

  // var token="1";
  //   if (token==1) {
  //     /*如果登录过了还访问logn页面就直接跳转首页*/
  //     if (to.path == '/login.html') {
  //       next({path: '/'})
  //     } else {
  //       next()
  //     }
  //   } else {
  //       next('/login.html')
  //   }
  
  // ...
})

// 4 挂载
new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

// 设置cookie
// Vue.prototype.setCookie = function (name, value,day) {
//   /*
//   * 使用
//   * this.setCookie("XXXX",res.token); 
//   */  
//   var Days = day || 365;    //这里设置天数
//   var exp = new Date();
//   exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
//   document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();
//   // document.cookie = name + "="+ escape (value) + ";domain=(这里可以放入指定使用的域名);expires=" + exp.toGMTString();
// }


// 获取cookie
// Vue.prototype.getCookie = function (name) {
//   /*
//   * 使用
//   * console.log(this.getCookie("XXX"))
//   */
//   var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
//   if (arr = document.cookie.match(reg)) {
//     return unescape(arr[2]);
//   } else {
//     return null;
//   }
// }


// // 删除cookie
// Vue.prototype.delCookie = function (name) {
//   /*
//   * 使用
//   * this.delCookie("XXX")
//   */
//   var exp = new Date();
//   exp.setTime(exp.getTime() - 1);
//   var cval = this.getCookie(name);
//   if (cval != null) {
//     document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
//   }
// }