package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
* 
* @TableName newtype
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Newtype implements Serializable {

    /**
    * 
    */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    /**
    * 
    */

    private String typeName;
    /**
    * 
    */

    private Integer type;



}
