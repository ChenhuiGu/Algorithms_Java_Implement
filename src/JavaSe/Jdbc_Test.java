package JavaSe;

public class Jdbc_Test {
    public static void main(String[] args) throws Exception {
        Jdbc_utils jdbcUtils = new Jdbc_utils();
        String sql = "update t_user set username='Jousha' where id=6";
        jdbcUtils.update(sql);
    }


}

