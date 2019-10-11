package com.wanghy.test.demo;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author     ：WangHY
 * @Date       ：Created in 10:22 2019/3/4
 * @Description：
 */
public class PkgProjInfoDto implements Serializable {
    private static final long serialVersionUID = -2448109818582605703L;
    /** 主键 */
    private Long id;
    /** 资产包编号 */
    private String assetPkgNum;
    /** $1:资产包状态 $2: 00-预生成包 01-待校验 02-待封包 03-已封包 04-待置换 05-已到期 06-已失效 07-校验失败 08-提前退出 */
    private String assetPkgStat;
    /** 资产包版本 */
    private String assetPkgVersion;
    /** 期数 */
    private Integer term;
    /** $1:是否当前有效 $2:  0-否 1-是 */
    private String isCurrValid;
    /** $1资产包说明 $2:01-首期 02-置换 */
    private String assetPkgComment;
    /** 资金方 */
    private String capPty;
    /** 项目编号 */
    private String projNum;
    /** 项目名称 */
    private String projName;
    /** 合同金额 */
    private BigDecimal contrAmt;
    /** 资产包总价值 */
    private BigDecimal assetPkgWholeVal;
    /** 本期缺口 */
    private BigDecimal thtermGap;
    /** 合同开始日期 */
    private Date contrBeginDt;
    /** 合同结束日期 */
    private Date contrEndDt;
    /** 校验失败原因 */
    private String checkFailReason;
    /** 所属渠道 */
    private String belongChannel;
    /** 下一个版本的资产包id */
    private String nextPkgId;
    /** 封包日期 */
    private Date sealDate;
    /** 状态：100-生效，-100-废弃 */
    private Integer status;
    /** 创建人 */
    private String createUser;
    /** 创建时间 */
    private Date createTime;
    /** 修改人 */
    private String updateUser;
    /** 更新时间 */
    private Date updateTime;
    /**项目id*/
    private Long projId;
    /**还款日期*/
    private Date replDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetPkgNum() {
        return assetPkgNum;
    }

    public void setAssetPkgNum(String assetPkgNum) {
        this.assetPkgNum = assetPkgNum;
    }

    public String getAssetPkgStat() {
        return assetPkgStat;
    }

    public void setAssetPkgStat(String assetPkgStat) {
        this.assetPkgStat = assetPkgStat;
    }

    public String getAssetPkgVersion() {
        return assetPkgVersion;
    }

    public void setAssetPkgVersion(String assetPkgVersion) {
        this.assetPkgVersion = assetPkgVersion;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getIsCurrValid() {
        return isCurrValid;
    }

    public void setIsCurrValid(String isCurrValid) {
        this.isCurrValid = isCurrValid;
    }

    public String getAssetPkgComment() {
        return assetPkgComment;
    }

    public void setAssetPkgComment(String assetPkgComment) {
        this.assetPkgComment = assetPkgComment;
    }

    public String getCapPty() {
        return capPty;
    }

    public void setCapPty(String capPty) {
        this.capPty = capPty;
    }

    public String getProjNum() {
        return projNum;
    }

    public void setProjNum(String projNum) {
        this.projNum = projNum;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public BigDecimal getContrAmt() {
        return contrAmt;
    }

    public void setContrAmt(BigDecimal contrAmt) {
        this.contrAmt = contrAmt;
    }

    public BigDecimal getAssetPkgWholeVal() {
        return assetPkgWholeVal;
    }

    public void setAssetPkgWholeVal(BigDecimal assetPkgWholeVal) {
        this.assetPkgWholeVal = assetPkgWholeVal;
    }

    public BigDecimal getThtermGap() {
        return thtermGap;
    }

    public void setThtermGap(BigDecimal thtermGap) {
        this.thtermGap = thtermGap;
    }

    public Date getContrBeginDt() {
        return contrBeginDt;
    }

    public void setContrBeginDt(Date contrBeginDt) {
        this.contrBeginDt = contrBeginDt;
    }

    public Date getContrEndDt() {
        return contrEndDt;
    }

    public void setContrEndDt(Date contrEndDt) {
        this.contrEndDt = contrEndDt;
    }

    public String getCheckFailReason() {
        return checkFailReason;
    }

    public void setCheckFailReason(String checkFailReason) {
        this.checkFailReason = checkFailReason;
    }

    public String getBelongChannel() {
        return belongChannel;
    }

    public void setBelongChannel(String belongChannel) {
        this.belongChannel = belongChannel;
    }

    public String getNextPkgId() {
        return nextPkgId;
    }

    public void setNextPkgId(String nextPkgId) {
        this.nextPkgId = nextPkgId;
    }

    public Date getSealDate() {
        return sealDate;
    }

    public void setSealDate(Date sealDate) {
        this.sealDate = sealDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getProjId() {
        return projId;
    }

    public void setProjId(Long projId) {
        this.projId = projId;
    }

    public Date getReplDay() {
        return replDay;
    }

    public void setReplDay(Date replDay) {
        this.replDay = replDay;
    }

    public void test(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");

    }

    public static void main(String[] args){
        new PkgProjInfoDto().test();
    }

}
