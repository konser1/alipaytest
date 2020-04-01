package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询储值方案
 *
 * @author auto create
 * @since 1.0, 2020-02-25 13:31:50
 */
public class AlipayMerchantPayforprivilegePromotionplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5636154437217848483L;

	/**
	 * 充享惠方案ID
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

	public String getPromotionPlanId() {
		return this.promotionPlanId;
	}
	public void setPromotionPlanId(String promotionPlanId) {
		this.promotionPlanId = promotionPlanId;
	}

}
