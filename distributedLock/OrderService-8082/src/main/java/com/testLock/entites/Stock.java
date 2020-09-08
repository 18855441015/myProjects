package com.testLock.entites;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description:库存
 * @Author: 刘爽
 * @Date: 2020/9/7 10:48
 **/
@Data
@TableName("stock")
public class Stock implements Serializable {

    private static final long serialVersionUID = -8371023174541278121L;

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @TableField(value = "goods")
    private Integer goods;
}
