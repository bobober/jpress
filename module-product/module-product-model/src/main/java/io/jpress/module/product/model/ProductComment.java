package io.jpress.module.product.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.product.model.base.BaseProductComment;

/**
 * Generated by JPress.
 */
@Table(tableName = "product_comment", primaryKey = "id")
public class ProductComment extends BaseProductComment<ProductComment> {

    private static final long serialVersionUID = 1L;

    public static final int STATUS_NORMAL = 1; //正常
    public static final int STATUS_UNAUDITED = 2; //待审核
    public static final int STATUS_TRASH = 3; //垃圾箱

    public boolean isNormal() {
        return getStatus() != null && getStatus() == STATUS_NORMAL;
    }

}
