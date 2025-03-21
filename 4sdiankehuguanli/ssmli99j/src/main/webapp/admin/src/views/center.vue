<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" readonly              placeholder="账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yonghu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yonghuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='yonghu'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="yonghuzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="备注" prop="beizhu">
          <el-input v-model="ruleForm.beizhu"               placeholder="备注" clearable></el-input>
        </el-form-item>
      </el-col>
                                                <el-col :span="12">
        <el-form-item   v-if="flag=='mendian'"  label="门店账号" prop="mendianzhanghao">
          <el-input v-model="ruleForm.mendianzhanghao" readonly              placeholder="门店账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='mendian'"  label="门店名称" prop="mendianmingcheng">
          <el-input v-model="ruleForm.mendianmingcheng"               placeholder="门店名称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='mendian'"  label="负责人" prop="fuzeren">
          <el-input v-model="ruleForm.fuzeren"               placeholder="负责人" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='mendian'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='mendian'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='mendian'" label="门店照片" prop="mendianzhaopian">
          <file-upload
          tip="点击上传门店照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.mendianzhaopian?ruleForm.mendianzhaopian:''"
          @change="mendianmendianzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='mendian'"  label="备注" prop="beizhu">
          <el-input v-model="ruleForm.beizhu"               placeholder="备注" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                                                                          <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                  yonghuxingbieOptions: [],
                                                                                                                                                                                                                                                                                                    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                            this.yonghuxingbieOptions = "男,女".split(',')
                                                                                                                                                                                                  },
  methods: {
                                                                                                                                                                                                                                                                                                        yonghuzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                        mendianmendianzhaopianUploadChange(fileUrls) {
        this.ruleForm.mendianzhaopian = fileUrls;
    },
                                                                                            onUpdateHandler() {
                              if((!this.ruleForm.zhanghao)&& 'yonghu'==this.flag){
        this.$message.error('账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yonghu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                                      if( 'yonghu' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
                                                                        if( 'yonghu' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                        if((!this.ruleForm.mendianzhanghao)&& 'mendian'==this.flag){
        this.$message.error('门店账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'mendian'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                                      if( 'mendian' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
                                                                        if( 'mendian' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                                                                                                                                          this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
