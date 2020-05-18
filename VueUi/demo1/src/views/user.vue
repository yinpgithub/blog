<template>
  <div v-loading.fullscreen.lock="fullscreenLoading" class="user">
    <el-table
      :stripe="true"
      :border="true"
      :highlight-current-row="true"
      :data="tableData"
      style="width: 100%">
      <el-table-column label="头像" width="100">
        <template scope="scope">
          <el-popover
            placement="right"
            title=""
            trigger="click">
            <el-image slot="reference" :src="scope.row.headPortrait" :alt="scope.row.headPortrait"></el-image>
            <el-image class="maxImg" :src="scope.row.headPortrait" ></el-image>
          </el-popover>
        </template>
      </el-table-column> 
      <el-table-column
        prop="userName"
        label="用户名"
        width="180">
      </el-table-column>
      <el-table-column
        prop="mail"
        label="邮箱"
        width="180">
      </el-table-column>
      <el-table-column
        prop="dt"
        label="注册时间"
        width="180">
      </el-table-column>
      <el-table-column
        prop="role.roleName"
        label="角色"
        width="180">
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        fullscreenLoading:false,
        tableData: []
      }
    },
    methods:{
      getData(){
        this.fullscreenLoading = true;
        this.$http.post('/api/user/findUserList').then(response => {
        console.log(response);
        this.fullscreenLoading = false;
          
        if(response.data.code==200){
            this.tableData=response.data.result;
            // this.tableData.map(res=>{
            //   console.log(res)
            //   res.userName;
            //   res.password;

            // });
          this.$message({
            message: response.data.msg,
            type: 'success',
            center: true
          });
        }else{
          this.$router.push({
            path: '/error.html',
            query: {
              code: response.data.code,
              msg: response.data.msg
            }
          })
        }
        }).catch(error => {
          this.fullscreenLoading = false;
          console.log(error);
          this.$router.push({
            path: '/error.html',
            query: {
              code: '500',
              msg:'服务器内部错误'
            }
          })
        });
      }
    },
    // 初始化加载方法
    mounted(){
      this.getData();
    },
    // 监听数据变化
    watch:{
      // tableData(newVal,oldVal){
        
      // }
    }
  }
</script>
<style scoped>
  .el-table
  .user{
    background-color: #409EFF;
    height: 100%;
  }
  .el-image{
    width: 50px;
    height: 50px;
    border-radius:50px
  }
  .maxImg{
    width: 1400px;
    height: 700px;
  }
</style>