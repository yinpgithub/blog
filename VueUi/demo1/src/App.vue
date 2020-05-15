<template>
  <div id="app">
    <el-container>
      <el-header>头部</el-header>
        <el-container>
          <el-aside width="200px">
            <el-menu>
              <el-submenu index="1">
                <template slot="title"><i class="el-icon-s-tools"></i>设置</template>
                <el-menu-item-group class=".el-menu-item-group">
                  <router-link to="/"><el-menu-item index="1-1">首&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;页</el-menu-item></router-link>
                  <router-link to="/user"><el-menu-item index="1-2">用户管理</el-menu-item></router-link>
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

<script>

export default {
  name: 'App',
  components: {
  }
}
</script>

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
<style>
  html,
  body,
  #app,
  .el-container {
    padding: 0px;
    margin: 0px;
    height: 100%;
  }
</style>
