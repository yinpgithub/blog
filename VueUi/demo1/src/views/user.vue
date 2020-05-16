<template>
  <div>
    <el-table
    :data="tableData"
    :stripe="true"
    style="width: 100%">
      <el-table-column
        prop="date"
        label="日期"
        width="180">
      </el-table-column>
      <el-table-column
        prop="name"
        label="姓名"
        width="180">
      </el-table-column>
      <el-table-column
        prop="address"
        label="地址">
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-04',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1517 弄'
        }, {
          date: '2016-05-01',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1519 弄'
        }, {
          date: '2016-05-03',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1516 弄'
        }]
      }
    },
    methods:{
      getData(){
        this.$http.post('/api/login.do').then(response => {
          console.log(response);
        }).catch(error => {
          console.log(error);
        });
        this.tableData=[{
          date: '2016-05-02',
          name: '尹鹏',
          address: '上海市普陀区金沙江路 1518 弄'
        }];
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