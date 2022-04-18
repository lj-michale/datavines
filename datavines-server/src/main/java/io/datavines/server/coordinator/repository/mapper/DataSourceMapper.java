package io.datavines.server.coordinator.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.datavines.server.coordinator.repository.entity.DataSource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataSourceMapper extends BaseMapper<DataSource> {

}