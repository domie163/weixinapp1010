const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmli99j/",
            name: "ssmli99j",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmli99j/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "4S店客户管理系统小程序"
        } 
    }
}
export default base
