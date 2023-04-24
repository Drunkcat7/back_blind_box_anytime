package com.back_blind_box_anytime.dao;

import com.back_blind_box_anytime.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Address)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-19 08:31:50
 */
public interface AddressDao {

    /**
     * 通过uid查询数据对象列表
     * @param uid
     * @return 对象列表
     */
    List<Address> queryByUid(Integer uid);

    /**
     * 通过 uid 和 address_id 修改数据
     * @param address
     * @return 影响行数
     */
    int updateByUidAndAddressId(Address address);


    /**
     * 通过 address_id 和 uid 删除数据
     * @param addressId
     * @return
     */
    int deleteByUidAndAddressId(Integer addressId,Integer uid);

    /**
     * 通过 uid defaultContact(默认地址值)全部改为0
     * @param uid
     * @return
     */
    int updateDefaultContact0ByUid(Integer uid);

    /**
     * 通过 address_id 和 uid  defaultContact(默认地址值)改为1
     * @param addressId
     * @param uid
     * @return
     */
    int updateDefaultContact1ByUidAndAddressId(@Param("addressId")Integer addressId,@Param("uid")Integer uid);


    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 影响行数
     */
    int insert(Address address);

    /**
     * 通过 defaultContact 和 uid 查询
     * @param uid
     * @return
     */
    List<Address> queryByUidAndDefaultContact(Integer uid);

//    ------------

    /**
     * 通过ID查询单条数据
     *
     * @param addressId 主键
     * @return 实例对象
     */
    Address queryById(Integer addressId);

}

