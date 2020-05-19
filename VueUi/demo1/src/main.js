import Vue from "vue";
import App from "./App.vue";
import VueRouter from "vue-router";

Vue.config.productionTip = false;
import ElementUI from "element-ui";
import "element-ui/lib/theme-chalk/index.css";
import axios from "axios";
import Cookies from 'js-cookie';


Vue.use(ElementUI);
Vue.use(VueRouter);

Vue.prototype.$http = axios;
Vue.prototype.$Cookies = Cookies;

//1`创建组件
import index from "./views/index.vue";
import error from "./views/error.vue";
import login from "./views/login.vue";

import admin_home from "./views/admin/home.vue";
import admin_user from "./views/admin/user.vue";
import admin_index from "./views/admin/index.vue";

//2`配置路由
const routes = [
  {
    path: "/admin",
    redirect: "/admin/home.html",
    component: admin_index,
    children: [
      { path: "/admin/home.html", component: admin_home },
      { path: "/admin/user.html", component: admin_user },
    ],
  },
  { path: "/login.html", component: login },
  { path: "/error.html", component: error },
  { path: "/", component: index },
];
//3`实例化vuerouter
const router = new VueRouter({
  mode: "history",
  routes
});
router.beforeEach((to, from, next) => {
  next();
  var token=Cookies.get("token");
  console.log(token);
  if (token) {
    /*如果登录过了还访问logn页面就直接跳转首页*/
    // if (to.path == '/login.html') {
    //   next({path: '/'})
    // } else {
    //   next()
    // }
  } else {
      if(to.path.substring(0,6)=="/admin"){
        next('/login.html')
      }
      
  }
  

  // ...
});
// 4 挂载
new Vue({
  router,
  render: (h) => h(App),
}).$mount("#app");