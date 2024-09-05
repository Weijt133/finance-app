package com.assessment.YOUx.repository;

import com.assessment.YOUx.model.FinanceApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

// 继承 MongoRepository，参数分别为实体类型和主键类型
public interface FinanceApplicationRepository extends MongoRepository<FinanceApplication, String> {

    // 可以根据需要自定义查询方法
    List<FinanceApplication> findByPersonalDetails(String personalDetails);

    // 可以根据其他字段查询，例如收入区间
    List<FinanceApplication> findByIncomeBetween(double minIncome, double maxIncome);
}
