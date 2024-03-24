package com.yangushan.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Arrays;

/**
 * created by yangushan
 * 2024/3/24 17:11
 */
@Intercepts({@Signature(type = Executor.class, method="query", args = {
  MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class
})})
public class MyPlugin implements Interceptor {
  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    Object[] args = invocation.getArgs();
    System.out.println(Arrays.toString(args));

    // 如果还有下一个插件会继续往下传递
    return invocation.proceed();
  }
}
