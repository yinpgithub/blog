<template>
  <div id="login">
    <el-form ref="form" label-width="80px">
      <h1>这是登陆页</h1>
      <el-input v-model="userName" placeholder="用户名"></el-input>
      <el-input type="password" v-model="password" placeholder="密码"></el-input>
      <el-button
      type="primary"
      @click="loginDo"
      v-loading.fullscreen.lock="fullscreenLoading">
      登陆
    </el-button>
  </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      userName: 'admin',
      password:'123456',
      model:'',
      fullscreenLoading: false
    }
  },
  methods:{
    loginDo(){
      this.fullscreenLoading = true;
      this.$http.post('/api/login.do',{
        userName:this.userName,
        password:this.password
      }).then(response => {
        this.fullscreenLoading = false;
        if(response.data.code==200){
          this.$message({
            message: response.data.result,
            type: 'success',
            center: true
          });
          this.$router.push({
            path: '/',
          })
        }else{
          this.$message({
            message:response.data.result,
            type: 'error',
            center: true,
          });
        }
      }).catch(error => {
        this.fullscreenLoading = false;
        console.log(error);
        this.$message({
            message:'服务器内部错误',
            type: 'error',
            center: true,
          });
      }); 
    }
  }
}
</script>
<style scoped>
    .login{
      background-image: url(../assets/1.jpg);
      background-size:100% 100%;
      margin: 0px;
      padding: 0px;
      height: 100%;
    }
    .el-form{
      width: 400px;
      height: 400px;
      position: absolute;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
      margin: auto;
      text-align: center;
    }
    .el-input{
      margin: 10px;
    }
    .el-button{
     
      width: 200px;
    }
</style>