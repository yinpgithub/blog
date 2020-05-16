<template>
  <div id="app">
    <el-container>
      <el-header>头部</el-header>
        <el-container>
          <el-aside width="200px">
            <el-menu
            :default-active="this.$route.path"
            >
              <el-submenu index="1">
                <template slot="title"><i class="el-icon-s-tools"></i>设置</template>
                <el-menu-item-group class=".el-menu-item-group">
                  <el-menu-item index="/home.html" @click="$router.push('/home.html')">首页</el-menu-item>
                  <el-menu-item index="/user.html" @click="$router.push('/user.html')">用户管理</el-menu-item>
                  <el-menu-item index="/login.html" @click="$router.push('/login.html')">登陆</el-menu-item>
                </el-menu-item-group>
              </el-submenu>
            </el-menu>
          </el-aside>
          <el-main><router-view></router-view></el-main>
        </el-container>
      <el-footer>底部</el-footer>
    </el-container>
  </div>
</template>

<style scoped>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.el-header, .el-footer {
    background-color: #B2DFEE;
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

  .el-menu-item-group a{
    text-decoration:none;
  }

  .el-menu{
    height: 100%;
  }
</style>