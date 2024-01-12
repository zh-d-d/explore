package com.dogbody.snaker.flow.server.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dogbody.snaker.flow.server.dao.WfHistOrderMapper;
import com.dogbody.snaker.flow.server.po.WfHistOrder;
import com.dogbody.snaker.flow.server.service.WfHistOrderService;
/**
 * @author zhangdd on 2023/12/27
 */
@Service
public class WfHistOrderServiceImpl extends ServiceImpl<WfHistOrderMapper, WfHistOrder> implements WfHistOrderService{

}
