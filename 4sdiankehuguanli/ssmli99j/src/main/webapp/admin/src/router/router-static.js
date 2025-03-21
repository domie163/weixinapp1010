import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import chezhan from '@/views/modules/chezhan/list'
    import yuyueshijia from '@/views/modules/yuyueshijia/list'
    import mendian from '@/views/modules/mendian/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discusschezhan from '@/views/modules/discusschezhan/list'
    import qichepinpai from '@/views/modules/qichepinpai/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import xinwentoutiao from '@/views/modules/xinwentoutiao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/chezhan',
        name: '车展',
        component: chezhan
      }
          ,{
	path: '/yuyueshijia',
        name: '预约试驾',
        component: yuyueshijia
      }
          ,{
	path: '/mendian',
        name: '门店',
        component: mendian
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/discusschezhan',
        name: '车展评论',
        component: discusschezhan
      }
          ,{
	path: '/qichepinpai',
        name: '汽车品牌',
        component: qichepinpai
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/xinwentoutiao',
        name: '新闻头条',
        component: xinwentoutiao
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
