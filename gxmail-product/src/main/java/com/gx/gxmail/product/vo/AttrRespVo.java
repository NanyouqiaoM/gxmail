package com.gx.gxmail.product.vo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AttrRespVo extends AttrVo {
        String catelogName;
        String groupName;
        Long[] catelogPath;
}
