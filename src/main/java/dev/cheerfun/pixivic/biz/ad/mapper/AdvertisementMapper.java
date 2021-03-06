package dev.cheerfun.pixivic.biz.ad.mapper;

import dev.cheerfun.pixivic.biz.ad.po.AdvertisementInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdvertisementMapper {
    @Select("select * from advertisement where use_flag=1")
    @Results({
            @Result(property = "id", column = "ad_id"),
            @Result(property = "title", column = "ad_title"),
            @Result(property = "type", column = "ad_type"),
            @Result(property = "imageUrl", column = "image_url"),
            @Result(property = "imageHeight", column = "image_height"),
            @Result(property = "imageWidth", column = "image_width"),
            @Result(property = "advertiserName", column = "advertiser_name"),
            @Result(property = "advertiserAvatar", column = "advertiser_avatar"),
            @Result(property = "useFlag", column = "use_flag"),
    })
    List<AdvertisementInfo> queryAllEnableAdvertisementInfo();
}
