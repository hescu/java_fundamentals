package mysql.labs;
import com.mysql.cj.jdbc.MysqlDataSource;
public class DataSourcePool {
    public static MysqlDataSource getDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("localhost");
        dataSource.setPort(3306);
        dataSource.setDatabaseName("airtravel");
        dataSource.setUser("SOME_USER");
        dataSource.setPassword("MY_PASSWORD");

        return dataSource;
    }
}
