package com.alibaba.druid.support.ibatis;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.common.util.PaginatedList;
import com.ibatis.sqlmap.client.SqlMapExecutor;
import com.ibatis.sqlmap.client.event.RowHandler;
import com.ibatis.sqlmap.engine.execution.BatchException;
import com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient;
import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;

@SuppressWarnings("deprecation")
public class SqlMapExecutorWrapper implements SqlMapExecutor {

    private SqlMapExecutor                  executor;

    protected final SqlMapClientImpl        clientImpl;
    protected final SqlMapClientImplWrapper clientImplWrapper;

    public SqlMapExecutorWrapper(ExtendedSqlMapClient client, SqlMapExecutor executor){
        this.executor = executor;

        this.clientImpl = client.getClass() == SqlMapClientImpl.class ? (SqlMapClientImpl) client : null;
        this.clientImplWrapper = clientImpl != null ? new SqlMapClientImplWrapper(clientImpl) : null;
    }

    public Object insert(String id, Object parameterObject) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        return executor.insert(id, parameterObject);
    }

    public Object insert(String id) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        return executor.insert(id);
    }

    public int update(String id, Object parameterObject) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        int effectedRowCount = executor.update(id, parameterObject);
        return effectedRowCount;
    }

    public int update(String id) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        int effectedRowCount = executor.update(id);

        return effectedRowCount;
    }

    public int delete(String id, Object parameterObject) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        int effectedRowCount = executor.delete(id, parameterObject);

        return effectedRowCount;
    }

    public int delete(String id) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        int effectedRowCount = executor.delete(id);

        return effectedRowCount;
    }

    public Object queryForObject(String id, Object parameterObject) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        Object object = executor.queryForObject(id, parameterObject);

        return object;
    }

    public Object queryForObject(String id) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        Object object = executor.queryForObject(id);

        return object;
    }

    public Object queryForObject(String id, Object parameterObject, Object resultObject) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        Object object = executor.queryForObject(id, parameterObject, resultObject);

        return object;
    }

    @SuppressWarnings("rawtypes")
    public List queryForList(String id, Object parameterObject) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        List list = executor.queryForList(id, parameterObject);

        return list;
    }

    @SuppressWarnings("rawtypes")
    public List queryForList(String id) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        List list = executor.queryForList(id);

        return list;
    }

    @SuppressWarnings("rawtypes")
    public List queryForList(String id, Object parameterObject, int skip, int max) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        List list = executor.queryForList(id, parameterObject, skip, max);

        return list;
    }

    @SuppressWarnings("rawtypes")
    public List queryForList(String id, int skip, int max) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        List list = executor.queryForList(id, skip, max);

        return list;
    }

    public void queryWithRowHandler(String id, Object parameterObject, RowHandler rowHandler) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        executor.queryWithRowHandler(id, parameterObject, rowHandler);
    }

    public void queryWithRowHandler(String id, RowHandler rowHandler) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        executor.queryWithRowHandler(id, rowHandler);
    }

    public PaginatedList queryForPaginatedList(String id, Object parameterObject, int pageSize) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        PaginatedList list = executor.queryForPaginatedList(id, parameterObject, pageSize);

        return list;
    }

    public PaginatedList queryForPaginatedList(String id, int pageSize) throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        PaginatedList list = executor.queryForPaginatedList(id, pageSize);

        return list;
    }

    @SuppressWarnings("rawtypes")
    public Map queryForMap(String id, Object parameterObject, String keyProp) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        Map map = executor.queryForMap(id, parameterObject, keyProp);

        return map;
    }

    @SuppressWarnings("rawtypes")
    public Map queryForMap(String id, Object parameterObject, String keyProp, String valueProp) throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        Map map = executor.queryForMap(id, parameterObject, keyProp, valueProp);

        return map;
    }

    public void startBatch() throws SQLException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        executor.startBatch();
    }

    public int executeBatch() throws SQLException {

        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        return executor.executeBatch();
    }

    @SuppressWarnings("rawtypes")
    public List executeBatchDetailed() throws SQLException, BatchException {
        IbatisUtils.setClientImpl(executor, clientImplWrapper);
        return executor.executeBatchDetailed();
    }

}
