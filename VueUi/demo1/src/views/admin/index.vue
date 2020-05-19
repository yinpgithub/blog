<template>
  <div id="app">
    <el-container>
      <el-header>
        <div>
          Blog 后台管理
          <span class="huangying">
            <a href="javascript:void(0);">
              <el-dropdown trigger="click">
                <span class="el-dropdown-link">
                  <span>{{ userName }}</span>
                  <i class="el-icon-arrow-down el-icon--right"></i>
                </span>
                <el-dropdown-menu slot="dropdown">
                  <a href="javascript:void(0);" @click="tuichudenglu">
                    <el-dropdown-item>退出登录</el-dropdown-item>
                  </a>
                  <a href="/admin/">
                    <el-dropdown-item>网站首页</el-dropdown-item>
                  </a>
                </el-dropdown-menu>
              </el-dropdown>
            </a>
          </span>
        </div>
      </el-header>
      <el-container>
        <el-aside width="200px">
          <el-menu :default-active="this.$route.path">
            <el-submenu index="1">
              <template slot="title"
                ><i class="el-icon-s-tools"></i>设置</template
              >
              <el-menu-item-group class=".el-menu-item-group">
                <el-menu-item
                  index="/admin/home.html"
                  @click="$router.push('/admin/home.html')"
                  >首页</el-menu-item
                >
                <el-menu-item
                  index="/admin/user.html"
                  @click="$router.push('/admin/user.html')"
                  >用户管理</el-menu-item
                >
                <el-menu-item
                  index="/login.html"
                  @click="$router.push('/login.html')"
                  >登陆</el-menu-item
                >
              </el-menu-item-group>
            </el-submenu>
          </el-menu>
        </el-aside>
        <el-main><router-view></router-view></el-main>
      </el-container>
      <!-- <el-footer>底部</el-footer> -->
    </el-container>
  </div>
</template>
<script>
export default {
  data() {
    return {
      userName: this.$Cookies.get("userName"),
    };
  },
  methods: {
    tuichudenglu() {
      this.$Cookies.remove("token");
      this.$Cookies.remove("userName");
      this.$message({
        message: "退出登录成功！",
        type: "success",
        center: true,
      });
      this.$router.push({
        path: "/",
      });
    },
  },
  mounted() {},
};
</script>
<style scoped>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.el-header,
.el-footer {
  background-color: #b2dfee;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  background-color: #e6e6e6;
  color: #333;
  text-align: center;
  line-height: 200px;
}

.el-main {
  background-color: #e6e6e6;
  color: #333;
  text-align: center;
  line-height: 160px;
}

body > .el-container {
  margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}

.el-menu-item.is-active {
  background-color: rgb(231, 235, 240) !important;
}

.el-menu-item-group a {
  text-decoration: none;
}

.el-menu {
  height: 100%;
}
.huangying {
  float: right;
  right: 10%;
}
a {
  text-decoration: none;
}
</style>
