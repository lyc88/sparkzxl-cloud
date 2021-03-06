package com.github.sparkzxl.activiti.infrastructure.convert;

import com.github.sparkzxl.activiti.domain.entity.DriveProcess;
import com.github.sparkzxl.activiti.dto.DriverProcessDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * description: activiti驱动convert
 *
 * @author: zhouxinlei
 * @date: 2020-10-01 22:10:00
 */
@Mapper
public interface ActivitiDriverConvert {

    ActivitiDriverConvert INSTANCE = Mappers.getMapper(ActivitiDriverConvert.class);

    /**
     * 转化driverProcessDTO为DriveProcess
     *
     * @param driverProcessDTO 流程驱动入参
     * @return DriveProcess
     */
    DriveProcess convertDriveProcess(DriverProcessDTO driverProcessDTO);
}
