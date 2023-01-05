package cn.edu.njfu.zyf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "score_sheet")
public class ScoreSheet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    @Column(name = "user_unchangeable_code")
    private String userEmployeeNumber;
    private String userPassword;
    
    // 1、党委办公室
    private Double coreWork_dwbgs;
    private Double importantWork_dwbgs;
    private String comment_dwbgs;
    
    // 2、党委组织部、党校
    private Double coreWork_dwzzb;
    private Double importantWork_dwzzb;
    private String comment_dwzzb;
    
    // 3、党委宣传部
    private Double coreWork_dwxcb;
    private Double importantWork_dwxcb;
    private String comment_dwxcb;
    
    // 4、党委统战部
    private Double coreWork_dwtzb;
    private Double importantWork_dwtzb;
    private String comment_dwtzb;
    
    // 5、纪检监察机构
    private Double coreWork_jjjcjg;
    private Double importantWork_jjjcjg;
    private String comment_jjjcjg;
    
    // 6、学生工作部
    private Double coreWork_xsgzb;
    private Double importantWork_xsgzb;
    private String comment_xsgzb;
    
    // 7 保卫部
    private Double coreWork_bwb;
    private Double importantWork_bwb;
    private String comment_bwb;
    
    // 8 校工会
    private Double coreWork_xgh;
    private Double importantWork_xgh;
    private String comment_xgh;
    
    // 9 校团委
    private Double coreWork_xtw;
    private Double importantWork_xtw;
    private String comment_xtw;
    
    // 10 机关党委
    private Double coreWork_jgdw;
    private Double importantWork_jgdw;
    private String comment_jgdw;
    
    // 11 校长办公室
    private Double coreWork_xzbgs;
    private Double importantWork_xzbgs;
    private String comment_xzbgs;
    
    // 12 发展规划与学科建设处
    private Double coreWork_fzghyxkjsc;
    private Double importantWork_fzghyxkjsc;
    private String comment_fzghyxkjsc;
    
    // 13 教务处、教师教学发展中心
    private Double coreWork_jwc;
    private Double importantWork_jwc;
    private String comment_jwc;
    
    // 14 科技处、科技开发服务部、军工项目办
    private Double coreWork_kjc;
    private Double importantWork_kjc;
    private String comment_kjc;
    
    // 15 人文社科处
    private Double coreWork_rwskc;
    private Double importantWork_rwskc;
    private String comment_rwskc;
    
    // 16 研究生院
    private Double coreWork_yjsy;
    private Double importantWork_yjsy;
    private String comment_yjsy;
    
    // 17 国际合作处
    private Double coreWork_gjhzc;
    private Double importantWork_gjhzc;
    private String comment_gjhzc;
    
    // 18 人事处
    private Double coreWork_rsc;
    private Double importantWork_rsc;
    private String comment_rsc;
    
    // 19 审计处
    private Double coreWork_sjc;
    private Double importantWork_sjc;
    private String comment_sjc;
    
    // 20 财务处
    private Double coreWork_cwc;
    private Double importantWork_cwc;
    private String comment_cwc;
    
    // 21 国有资产管理处
    private Double coreWork_gyzcglc;
    private Double importantWork_gyzcglc;
    private String comment_gyzcglc;
    
    // 22 实验室与基地建设管理处
    private Double coreWork_sysyjdjsglc;
    private Double importantWork_sysyjdjsglc;
    private String comment_sysyjdjsglc;
    
    // 23 白马校区建设指挥部
    private Double coreWork_bmxqjszhb;
    private Double importantWork_bmxqjszhb;
    private String comment_bmxqjszhb;
    
    // 24 基建处
    private Double coreWork_jjc;
    private Double importantWork_jjc;
    private String comment_jjc;
    
    // 25 后勤管理处
    private Double coreWork_hqglc;
    private Double importantWork_hqglc;
    private String comment_hqglc;
    
    // 26 离退休工作处
    private Double coreWork_ltxgzc;
    private Double importantWork_ltxgzc;
    private String comment_ltxgzc;
    
    // 27 教学评估办公室
    private Double coreWork_jxpgbgs;
    private Double importantWork_jxpgbgs;
    private String comment_jxpgbgs;
    
    // 28 网络安全和信息化办公室
    private Double coreWork_wlaqhxxhbgs;
    private Double importantWork_wlaqhxxhbgs;
    private String comment_wlaqhxxhbgs;
    
    // 29 继续教育学院
    private Double coreWork_jxjyxy;
    private Double importantWork_jxjyxy;
    private String comment_jxjyxy;
    
    // 30 国际教育学院
    private Double coreWork_gjjyxy;
    private Double importantWork_gjjyxy;
    private String comment_gjjyxy;
    
    // 31 图书馆
    private Double coreWork_tsg;
    private Double importantWork_tsg;
    private String comment_tsg;
    
    // 32 期刊编辑部
    private Double coreWork_qkbjb;
    private Double importantWork_qkbjb;
    private String comment_qkbjb;
    
    // 33 校友工作办公室
    private Double coreWork_xygzbgs;
    private Double importantWork_xygzbgs;
    private String comment_xygzbgs;
    
    // 34 资产经营公司
    private Double coreWork_zcjygs;
    private Double importantWork_zcjygs;
    private String comment_zcjygs;
    
    // 35 博物馆
    private Double coreWork_bwg;
    private Double importantWork_bwg;
    private String comment_bwg;
    
    // 36 现代分析测试中心
    private Double coreWork_xdfxcszx;
    private Double importantWork_xdfxcszx;
    private String comment_xdfxcszx;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmployeeNumber() {
        return userEmployeeNumber;
    }
    public void setUserEmployeeNumber(String userEmployeeNumber) {
        this.userEmployeeNumber = userEmployeeNumber;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Double getCoreWork_dwbgs() {
        return coreWork_dwbgs;
    }
    public void setCoreWork_dwbgs(Double coreWork_dwbgs) {
        this.coreWork_dwbgs = coreWork_dwbgs;
    }
    public Double getImportantWork_dwbgs() {
        return importantWork_dwbgs;
    }
    public void setImportantWork_dwbgs(Double importantWork_dwbgs) {
        this.importantWork_dwbgs = importantWork_dwbgs;
    }
    public String getComment_dwbgs() {
        return comment_dwbgs;
    }
    public void setComment_dwbgs(String comment_dwbgs) {
        this.comment_dwbgs = comment_dwbgs;
    }
    public Double getCoreWork_dwzzb() {
        return coreWork_dwzzb;
    }
    public void setCoreWork_dwzzb(Double coreWork_dwzzb) {
        this.coreWork_dwzzb = coreWork_dwzzb;
    }
    public Double getImportantWork_dwzzb() {
        return importantWork_dwzzb;
    }
    public void setImportantWork_dwzzb(Double importantWork_dwzzb) {
        this.importantWork_dwzzb = importantWork_dwzzb;
    }
    public String getComment_dwzzb() {
        return comment_dwzzb;
    }
    public void setComment_dwzzb(String comment_dwzzb) {
        this.comment_dwzzb = comment_dwzzb;
    }
    public Double getCoreWork_dwxcb() {
        return coreWork_dwxcb;
    }
    public void setCoreWork_dwxcb(Double coreWork_dwxcb) {
        this.coreWork_dwxcb = coreWork_dwxcb;
    }
    public Double getImportantWork_dwxcb() {
        return importantWork_dwxcb;
    }
    public void setImportantWork_dwxcb(Double importantWork_dwxcb) {
        this.importantWork_dwxcb = importantWork_dwxcb;
    }
    public String getComment_dwxcb() {
        return comment_dwxcb;
    }
    public void setComment_dwxcb(String comment_dwxcb) {
        this.comment_dwxcb = comment_dwxcb;
    }
    public Double getCoreWork_dwtzb() {
        return coreWork_dwtzb;
    }
    public void setCoreWork_dwtzb(Double coreWork_dwtzb) {
        this.coreWork_dwtzb = coreWork_dwtzb;
    }
    public Double getImportantWork_dwtzb() {
        return importantWork_dwtzb;
    }
    public void setImportantWork_dwtzb(Double importantWork_dwtzb) {
        this.importantWork_dwtzb = importantWork_dwtzb;
    }
    public String getComment_dwtzb() {
        return comment_dwtzb;
    }
    public void setComment_dwtzb(String comment_dwtzb) {
        this.comment_dwtzb = comment_dwtzb;
    }
    public Double getCoreWork_jjjcjg() {
        return coreWork_jjjcjg;
    }
    public void setCoreWork_jjjcjg(Double coreWork_jjjcjg) {
        this.coreWork_jjjcjg = coreWork_jjjcjg;
    }
    public Double getImportantWork_jjjcjg() {
        return importantWork_jjjcjg;
    }
    public void setImportantWork_jjjcjg(Double importantWork_jjjcjg) {
        this.importantWork_jjjcjg = importantWork_jjjcjg;
    }
    public String getComment_jjjcjg() {
        return comment_jjjcjg;
    }
    public void setComment_jjjcjg(String comment_jjjcjg) {
        this.comment_jjjcjg = comment_jjjcjg;
    }
    public Double getCoreWork_xsgzb() {
        return coreWork_xsgzb;
    }
    public void setCoreWork_xsgzb(Double coreWork_xsgzb) {
        this.coreWork_xsgzb = coreWork_xsgzb;
    }
    public Double getImportantWork_xsgzb() {
        return importantWork_xsgzb;
    }
    public void setImportantWork_xsgzb(Double importantWork_xsgzb) {
        this.importantWork_xsgzb = importantWork_xsgzb;
    }
    public String getComment_xsgzb() {
        return comment_xsgzb;
    }
    public void setComment_xsgzb(String comment_xsgzb) {
        this.comment_xsgzb = comment_xsgzb;
    }
    public Double getCoreWork_bwb() {
        return coreWork_bwb;
    }
    public void setCoreWork_bwb(Double coreWork_bwb) {
        this.coreWork_bwb = coreWork_bwb;
    }
    public Double getImportantWork_bwb() {
        return importantWork_bwb;
    }
    public void setImportantWork_bwb(Double importantWork_bwb) {
        this.importantWork_bwb = importantWork_bwb;
    }
    public String getComment_bwb() {
        return comment_bwb;
    }
    public void setComment_bwb(String comment_bwb) {
        this.comment_bwb = comment_bwb;
    }
    public Double getCoreWork_xgh() {
        return coreWork_xgh;
    }
    public void setCoreWork_xgh(Double coreWork_xgh) {
        this.coreWork_xgh = coreWork_xgh;
    }
    public Double getImportantWork_xgh() {
        return importantWork_xgh;
    }
    public void setImportantWork_xgh(Double importantWork_xgh) {
        this.importantWork_xgh = importantWork_xgh;
    }
    public String getComment_xgh() {
        return comment_xgh;
    }
    public void setComment_xgh(String comment_xgh) {
        this.comment_xgh = comment_xgh;
    }
    public Double getCoreWork_xtw() {
        return coreWork_xtw;
    }
    public void setCoreWork_xtw(Double coreWork_xtw) {
        this.coreWork_xtw = coreWork_xtw;
    }
    public Double getImportantWork_xtw() {
        return importantWork_xtw;
    }
    public void setImportantWork_xtw(Double importantWork_xtw) {
        this.importantWork_xtw = importantWork_xtw;
    }
    public String getComment_xtw() {
        return comment_xtw;
    }
    public void setComment_xtw(String comment_xtw) {
        this.comment_xtw = comment_xtw;
    }
    public Double getCoreWork_jgdw() {
        return coreWork_jgdw;
    }
    public void setCoreWork_jgdw(Double coreWork_jgdw) {
        this.coreWork_jgdw = coreWork_jgdw;
    }
    public Double getImportantWork_jgdw() {
        return importantWork_jgdw;
    }
    public void setImportantWork_jgdw(Double importantWork_jgdw) {
        this.importantWork_jgdw = importantWork_jgdw;
    }
    public String getComment_jgdw() {
        return comment_jgdw;
    }
    public void setComment_jgdw(String comment_jgdw) {
        this.comment_jgdw = comment_jgdw;
    }
    public Double getCoreWork_xzbgs() {
        return coreWork_xzbgs;
    }
    public void setCoreWork_xzbgs(Double coreWork_xzbgs) {
        this.coreWork_xzbgs = coreWork_xzbgs;
    }
    public Double getImportantWork_xzbgs() {
        return importantWork_xzbgs;
    }
    public void setImportantWork_xzbgs(Double importantWork_xzbgs) {
        this.importantWork_xzbgs = importantWork_xzbgs;
    }
    public String getComment_xzbgs() {
        return comment_xzbgs;
    }
    public void setComment_xzbgs(String comment_xzbgs) {
        this.comment_xzbgs = comment_xzbgs;
    }
    public Double getCoreWork_fzghyxkjsc() {
        return coreWork_fzghyxkjsc;
    }
    public void setCoreWork_fzghyxkjsc(Double coreWork_fzghyxkjsc) {
        this.coreWork_fzghyxkjsc = coreWork_fzghyxkjsc;
    }
    public Double getImportantWork_fzghyxkjsc() {
        return importantWork_fzghyxkjsc;
    }
    public void setImportantWork_fzghyxkjsc(Double importantWork_fzghyxkjsc) {
        this.importantWork_fzghyxkjsc = importantWork_fzghyxkjsc;
    }
    public String getComment_fzghyxkjsc() {
        return comment_fzghyxkjsc;
    }
    public void setComment_fzghyxkjsc(String comment_fzghyxkjsc) {
        this.comment_fzghyxkjsc = comment_fzghyxkjsc;
    }
    public Double getCoreWork_jwc() {
        return coreWork_jwc;
    }
    public void setCoreWork_jwc(Double coreWork_jwc) {
        this.coreWork_jwc = coreWork_jwc;
    }
    public Double getImportantWork_jwc() {
        return importantWork_jwc;
    }
    public void setImportantWork_jwc(Double importantWork_jwc) {
        this.importantWork_jwc = importantWork_jwc;
    }
    public String getComment_jwc() {
        return comment_jwc;
    }
    public void setComment_jwc(String comment_jwc) {
        this.comment_jwc = comment_jwc;
    }
    public Double getCoreWork_kjc() {
        return coreWork_kjc;
    }
    public void setCoreWork_kjc(Double coreWork_kjc) {
        this.coreWork_kjc = coreWork_kjc;
    }
    public Double getImportantWork_kjc() {
        return importantWork_kjc;
    }
    public void setImportantWork_kjc(Double importantWork_kjc) {
        this.importantWork_kjc = importantWork_kjc;
    }
    public String getComment_kjc() {
        return comment_kjc;
    }
    public void setComment_kjc(String comment_kjc) {
        this.comment_kjc = comment_kjc;
    }
    public Double getCoreWork_rwskc() {
        return coreWork_rwskc;
    }
    public void setCoreWork_rwskc(Double coreWork_rwskc) {
        this.coreWork_rwskc = coreWork_rwskc;
    }
    public Double getImportantWork_rwskc() {
        return importantWork_rwskc;
    }
    public void setImportantWork_rwskc(Double importantWork_rwskc) {
        this.importantWork_rwskc = importantWork_rwskc;
    }
    public String getComment_rwskc() {
        return comment_rwskc;
    }
    public void setComment_rwskc(String comment_rwskc) {
        this.comment_rwskc = comment_rwskc;
    }
    public Double getCoreWork_yjsy() {
        return coreWork_yjsy;
    }
    public void setCoreWork_yjsy(Double coreWork_yjsy) {
        this.coreWork_yjsy = coreWork_yjsy;
    }
    public Double getImportantWork_yjsy() {
        return importantWork_yjsy;
    }
    public void setImportantWork_yjsy(Double importantWork_yjsy) {
        this.importantWork_yjsy = importantWork_yjsy;
    }
    public String getComment_yjsy() {
        return comment_yjsy;
    }
    public void setComment_yjsy(String comment_yjsy) {
        this.comment_yjsy = comment_yjsy;
    }
    public Double getCoreWork_gjhzc() {
        return coreWork_gjhzc;
    }
    public void setCoreWork_gjhzc(Double coreWork_gjhzc) {
        this.coreWork_gjhzc = coreWork_gjhzc;
    }
    public Double getImportantWork_gjhzc() {
        return importantWork_gjhzc;
    }
    public void setImportantWork_gjhzc(Double importantWork_gjhzc) {
        this.importantWork_gjhzc = importantWork_gjhzc;
    }
    public String getComment_gjhzc() {
        return comment_gjhzc;
    }
    public void setComment_gjhzc(String comment_gjhzc) {
        this.comment_gjhzc = comment_gjhzc;
    }
    public Double getCoreWork_rsc() {
        return coreWork_rsc;
    }
    public void setCoreWork_rsc(Double coreWork_rsc) {
        this.coreWork_rsc = coreWork_rsc;
    }
    public Double getImportantWork_rsc() {
        return importantWork_rsc;
    }
    public void setImportantWork_rsc(Double importantWork_rsc) {
        this.importantWork_rsc = importantWork_rsc;
    }
    public String getComment_rsc() {
        return comment_rsc;
    }
    public void setComment_rsc(String comment_rsc) {
        this.comment_rsc = comment_rsc;
    }
    public Double getCoreWork_sjc() {
        return coreWork_sjc;
    }
    public void setCoreWork_sjc(Double coreWork_sjc) {
        this.coreWork_sjc = coreWork_sjc;
    }
    public Double getImportantWork_sjc() {
        return importantWork_sjc;
    }
    public void setImportantWork_sjc(Double importantWork_sjc) {
        this.importantWork_sjc = importantWork_sjc;
    }
    public String getComment_sjc() {
        return comment_sjc;
    }
    public void setComment_sjc(String comment_sjc) {
        this.comment_sjc = comment_sjc;
    }
    public Double getCoreWork_cwc() {
        return coreWork_cwc;
    }
    public void setCoreWork_cwc(Double coreWork_cwc) {
        this.coreWork_cwc = coreWork_cwc;
    }
    public Double getImportantWork_cwc() {
        return importantWork_cwc;
    }
    public void setImportantWork_cwc(Double importantWork_cwc) {
        this.importantWork_cwc = importantWork_cwc;
    }
    public String getComment_cwc() {
        return comment_cwc;
    }
    public void setComment_cwc(String comment_cwc) {
        this.comment_cwc = comment_cwc;
    }
    public Double getCoreWork_gyzcglc() {
        return coreWork_gyzcglc;
    }
    public void setCoreWork_gyzcglc(Double coreWork_gyzcglc) {
        this.coreWork_gyzcglc = coreWork_gyzcglc;
    }
    public Double getImportantWork_gyzcglc() {
        return importantWork_gyzcglc;
    }
    public void setImportantWork_gyzcglc(Double importantWork_gyzcglc) {
        this.importantWork_gyzcglc = importantWork_gyzcglc;
    }
    public String getComment_gyzcglc() {
        return comment_gyzcglc;
    }
    public void setComment_gyzcglc(String comment_gyzcglc) {
        this.comment_gyzcglc = comment_gyzcglc;
    }
    public Double getCoreWork_sysyjdjsglc() {
        return coreWork_sysyjdjsglc;
    }
    public void setCoreWork_sysyjdjsglc(Double coreWork_sysyjdjsglc) {
        this.coreWork_sysyjdjsglc = coreWork_sysyjdjsglc;
    }
    public Double getImportantWork_sysyjdjsglc() {
        return importantWork_sysyjdjsglc;
    }
    public void setImportantWork_sysyjdjsglc(Double importantWork_sysyjdjsglc) {
        this.importantWork_sysyjdjsglc = importantWork_sysyjdjsglc;
    }
    public String getComment_sysyjdjsglc() {
        return comment_sysyjdjsglc;
    }
    public void setComment_sysyjdjsglc(String comment_sysyjdjsglc) {
        this.comment_sysyjdjsglc = comment_sysyjdjsglc;
    }
    public Double getCoreWork_bmxqjszhb() {
        return coreWork_bmxqjszhb;
    }
    public void setCoreWork_bmxqjszhb(Double coreWork_bmxqjszhb) {
        this.coreWork_bmxqjszhb = coreWork_bmxqjszhb;
    }
    public Double getImportantWork_bmxqjszhb() {
        return importantWork_bmxqjszhb;
    }
    public void setImportantWork_bmxqjszhb(Double importantWork_bmxqjszhb) {
        this.importantWork_bmxqjszhb = importantWork_bmxqjszhb;
    }
    public String getComment_bmxqjszhb() {
        return comment_bmxqjszhb;
    }
    public void setComment_bmxqjszhb(String comment_bmxqjszhb) {
        this.comment_bmxqjszhb = comment_bmxqjszhb;
    }
    public Double getCoreWork_jjc() {
        return coreWork_jjc;
    }
    public void setCoreWork_jjc(Double coreWork_jjc) {
        this.coreWork_jjc = coreWork_jjc;
    }
    public Double getImportantWork_jjc() {
        return importantWork_jjc;
    }
    public void setImportantWork_jjc(Double importantWork_jjc) {
        this.importantWork_jjc = importantWork_jjc;
    }
    public String getComment_jjc() {
        return comment_jjc;
    }
    public void setComment_jjc(String comment_jjc) {
        this.comment_jjc = comment_jjc;
    }
    public Double getCoreWork_hqglc() {
        return coreWork_hqglc;
    }
    public void setCoreWork_hqglc(Double coreWork_hqglc) {
        this.coreWork_hqglc = coreWork_hqglc;
    }
    public Double getImportantWork_hqglc() {
        return importantWork_hqglc;
    }
    public void setImportantWork_hqglc(Double importantWork_hqglc) {
        this.importantWork_hqglc = importantWork_hqglc;
    }
    public String getComment_hqglc() {
        return comment_hqglc;
    }
    public void setComment_hqglc(String comment_hqglc) {
        this.comment_hqglc = comment_hqglc;
    }
    public Double getCoreWork_ltxgzc() {
        return coreWork_ltxgzc;
    }
    public void setCoreWork_ltxgzc(Double coreWork_ltxgzc) {
        this.coreWork_ltxgzc = coreWork_ltxgzc;
    }
    public Double getImportantWork_ltxgzc() {
        return importantWork_ltxgzc;
    }
    public void setImportantWork_ltxgzc(Double importantWork_ltxgzc) {
        this.importantWork_ltxgzc = importantWork_ltxgzc;
    }
    public String getComment_ltxgzc() {
        return comment_ltxgzc;
    }
    public void setComment_ltxgzc(String comment_ltxgzc) {
        this.comment_ltxgzc = comment_ltxgzc;
    }
    public Double getCoreWork_jxpgbgs() {
        return coreWork_jxpgbgs;
    }
    public void setCoreWork_jxpgbgs(Double coreWork_jxpgbgs) {
        this.coreWork_jxpgbgs = coreWork_jxpgbgs;
    }
    public Double getImportantWork_jxpgbgs() {
        return importantWork_jxpgbgs;
    }
    public void setImportantWork_jxpgbgs(Double importantWork_jxpgbgs) {
        this.importantWork_jxpgbgs = importantWork_jxpgbgs;
    }
    public String getComment_jxpgbgs() {
        return comment_jxpgbgs;
    }
    public void setComment_jxpgbgs(String comment_jxpgbgs) {
        this.comment_jxpgbgs = comment_jxpgbgs;
    }
    public Double getCoreWork_wlaqhxxhbgs() {
        return coreWork_wlaqhxxhbgs;
    }
    public void setCoreWork_wlaqhxxhbgs(Double coreWork_wlaqhxxhbgs) {
        this.coreWork_wlaqhxxhbgs = coreWork_wlaqhxxhbgs;
    }
    public Double getImportantWork_wlaqhxxhbgs() {
        return importantWork_wlaqhxxhbgs;
    }
    public void setImportantWork_wlaqhxxhbgs(Double importantWork_wlaqhxxhbgs) {
        this.importantWork_wlaqhxxhbgs = importantWork_wlaqhxxhbgs;
    }
    public String getComment_wlaqhxxhbgs() {
        return comment_wlaqhxxhbgs;
    }
    public void setComment_wlaqhxxhbgs(String comment_wlaqhxxhbgs) {
        this.comment_wlaqhxxhbgs = comment_wlaqhxxhbgs;
    }
    public Double getCoreWork_jxjyxy() {
        return coreWork_jxjyxy;
    }
    public void setCoreWork_jxjyxy(Double coreWork_jxjyxy) {
        this.coreWork_jxjyxy = coreWork_jxjyxy;
    }
    public Double getImportantWork_jxjyxy() {
        return importantWork_jxjyxy;
    }
    public void setImportantWork_jxjyxy(Double importantWork_jxjyxy) {
        this.importantWork_jxjyxy = importantWork_jxjyxy;
    }
    public String getComment_jxjyxy() {
        return comment_jxjyxy;
    }
    public void setComment_jxjyxy(String comment_jxjyxy) {
        this.comment_jxjyxy = comment_jxjyxy;
    }
    public Double getCoreWork_gjjyxy() {
        return coreWork_gjjyxy;
    }
    public void setCoreWork_gjjyxy(Double coreWork_gjjyxy) {
        this.coreWork_gjjyxy = coreWork_gjjyxy;
    }
    public Double getImportantWork_gjjyxy() {
        return importantWork_gjjyxy;
    }
    public void setImportantWork_gjjyxy(Double importantWork_gjjyxy) {
        this.importantWork_gjjyxy = importantWork_gjjyxy;
    }
    public String getComment_gjjyxy() {
        return comment_gjjyxy;
    }
    public void setComment_gjjyxy(String comment_gjjyxy) {
        this.comment_gjjyxy = comment_gjjyxy;
    }
    public Double getCoreWork_tsg() {
        return coreWork_tsg;
    }
    public void setCoreWork_tsg(Double coreWork_tsg) {
        this.coreWork_tsg = coreWork_tsg;
    }
    public Double getImportantWork_tsg() {
        return importantWork_tsg;
    }
    public void setImportantWork_tsg(Double importantWork_tsg) {
        this.importantWork_tsg = importantWork_tsg;
    }
    public String getComment_tsg() {
        return comment_tsg;
    }
    public void setComment_tsg(String comment_tsg) {
        this.comment_tsg = comment_tsg;
    }
    public Double getCoreWork_qkbjb() {
        return coreWork_qkbjb;
    }
    public void setCoreWork_qkbjb(Double coreWork_qkbjb) {
        this.coreWork_qkbjb = coreWork_qkbjb;
    }
    public Double getImportantWork_qkbjb() {
        return importantWork_qkbjb;
    }
    public void setImportantWork_qkbjb(Double importantWork_qkbjb) {
        this.importantWork_qkbjb = importantWork_qkbjb;
    }
    public String getComment_qkbjb() {
        return comment_qkbjb;
    }
    public void setComment_qkbjb(String comment_qkbjb) {
        this.comment_qkbjb = comment_qkbjb;
    }
    public Double getCoreWork_xygzbgs() {
        return coreWork_xygzbgs;
    }
    public void setCoreWork_xygzbgs(Double coreWork_xygzbgs) {
        this.coreWork_xygzbgs = coreWork_xygzbgs;
    }
    public Double getImportantWork_xygzbgs() {
        return importantWork_xygzbgs;
    }
    public void setImportantWork_xygzbgs(Double importantWork_xygzbgs) {
        this.importantWork_xygzbgs = importantWork_xygzbgs;
    }
    public String getComment_xygzbgs() {
        return comment_xygzbgs;
    }
    public void setComment_xygzbgs(String comment_xygzbgs) {
        this.comment_xygzbgs = comment_xygzbgs;
    }
    public Double getCoreWork_zcjygs() {
        return coreWork_zcjygs;
    }
    public void setCoreWork_zcjygs(Double coreWork_zcjygs) {
        this.coreWork_zcjygs = coreWork_zcjygs;
    }
    public Double getImportantWork_zcjygs() {
        return importantWork_zcjygs;
    }
    public void setImportantWork_zcjygs(Double importantWork_zcjygs) {
        this.importantWork_zcjygs = importantWork_zcjygs;
    }
    public String getComment_zcjygs() {
        return comment_zcjygs;
    }
    public void setComment_zcjygs(String comment_zcjygs) {
        this.comment_zcjygs = comment_zcjygs;
    }
    public Double getCoreWork_bwg() {
        return coreWork_bwg;
    }
    public void setCoreWork_bwg(Double coreWork_bwg) {
        this.coreWork_bwg = coreWork_bwg;
    }
    public Double getImportantWork_bwg() {
        return importantWork_bwg;
    }
    public void setImportantWork_bwg(Double importantWork_bwg) {
        this.importantWork_bwg = importantWork_bwg;
    }
    public String getComment_bwg() {
        return comment_bwg;
    }
    public void setComment_bwg(String comment_bwg) {
        this.comment_bwg = comment_bwg;
    }
    public Double getCoreWork_xdfxcszx() {
        return coreWork_xdfxcszx;
    }
    public void setCoreWork_xdfxcszx(Double coreWork_xdfxcszx) {
        this.coreWork_xdfxcszx = coreWork_xdfxcszx;
    }
    public Double getImportantWork_xdfxcszx() {
        return importantWork_xdfxcszx;
    }
    public void setImportantWork_xdfxcszx(Double importantWork_xdfxcszx) {
        this.importantWork_xdfxcszx = importantWork_xdfxcszx;
    }
    public String getComment_xdfxcszx() {
        return comment_xdfxcszx;
    }
    public void setComment_xdfxcszx(String comment_xdfxcszx) {
        this.comment_xdfxcszx = comment_xdfxcszx;
    }
    
    
    
}
