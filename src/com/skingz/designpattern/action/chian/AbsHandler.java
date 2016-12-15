/**
 * 
 */
package com.skingz.designpattern.action.chian;

/**
 * Title:    AbsHandler
 * Description: 申请聚餐费用的管理，申请聚餐费用的大致流程一般是，由申请人先填写申请单，然后交给领导审批，如果申请批准下来，领导会通知申请人审批通过，然后申请人去财务领取费用，如果没有批准下来，领导会通知申请人审批未通过，此事也就此作罢。
				不同级别的领导，对于审批的额度是不一样的，比如，项目经理只能审批500元以内的申请；部门经理能审批1000元以内的申请；而总经理可以审核任意额度的申请
 * @author Elizaber
 * @date 2016-12-15
 */
public abstract class AbsHandler {
	 /**
     * 持有后继的责任对象
     */
    protected AbsHandler successor=null;
   
    /**
     * 取值方法
     */
    public AbsHandler getSuccessor() {
        return successor;
    }
    /**
     * 赋值方法，设置后继的责任对象
     */
    public void setSuccessor(AbsHandler successor) {
        this.successor = successor;
    }
    /** 
     * 处理聚餐费用的申请 
     * @param user    申请人 
     * @param fee    申请的钱数 
     * @return        成功或失败的具体通知 
     */  
    public abstract String handleFeeRequest(String user , double fee);  
}
