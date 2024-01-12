package com.dogbody.snaker.flow.server.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author zhangdd on 2023/12/27
 */
/**
    * 历史流程实例表
    */
@TableName(value = "wf_hist_order")
public class WfHistOrder {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 流程定义ID
     */
    @TableField(value = "process_Id")
    private String processId;

    /**
     * 状态
     */
    @TableField(value = "order_State")
    private Boolean orderState;

    /**
     * 发起人
     */
    @TableField(value = "creator")
    private String creator;

    /**
     * 发起时间
     */
    @TableField(value = "create_Time")
    private String createTime;

    /**
     * 完成时间
     */
    @TableField(value = "end_Time")
    private String endTime;

    /**
     * 期望完成时间
     */
    @TableField(value = "expire_Time")
    private String expireTime;

    /**
     * 优先级
     */
    @TableField(value = "priority")
    private Boolean priority;

    /**
     * 父流程ID
     */
    @TableField(value = "parent_Id")
    private String parentId;

    /**
     * 流程实例编号
     */
    @TableField(value = "order_No")
    private String orderNo;

    /**
     * 附属变量json存储
     */
    @TableField(value = "`variable`")
    private String variable;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取流程定义ID
     *
     * @return process_Id - 流程定义ID
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * 设置流程定义ID
     *
     * @param processId 流程定义ID
     */
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    /**
     * 获取状态
     *
     * @return order_State - 状态
     */
    public Boolean getOrderState() {
        return orderState;
    }

    /**
     * 设置状态
     *
     * @param orderState 状态
     */
    public void setOrderState(Boolean orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取发起人
     *
     * @return creator - 发起人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置发起人
     *
     * @param creator 发起人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取发起时间
     *
     * @return create_Time - 发起时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置发起时间
     *
     * @param createTime 发起时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取完成时间
     *
     * @return end_Time - 完成时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置完成时间
     *
     * @param endTime 完成时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取期望完成时间
     *
     * @return expire_Time - 期望完成时间
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * 设置期望完成时间
     *
     * @param expireTime 期望完成时间
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取优先级
     *
     * @return priority - 优先级
     */
    public Boolean getPriority() {
        return priority;
    }

    /**
     * 设置优先级
     *
     * @param priority 优先级
     */
    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    /**
     * 获取父流程ID
     *
     * @return parent_Id - 父流程ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父流程ID
     *
     * @param parentId 父流程ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取流程实例编号
     *
     * @return order_No - 流程实例编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置流程实例编号
     *
     * @param orderNo 流程实例编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取附属变量json存储
     *
     * @return variable - 附属变量json存储
     */
    public String getVariable() {
        return variable;
    }

    /**
     * 设置附属变量json存储
     *
     * @param variable 附属变量json存储
     */
    public void setVariable(String variable) {
        this.variable = variable;
    }
}