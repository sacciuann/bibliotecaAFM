package bibliotecaAFM.utilities;

import org.hibernate.dialect.MySQL8Dialect;

public class Dialect extends MySQL8Dialect {

	@Override
	public String getTableTypeString() {
		return "ENGINE = InnoDB DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs";
	}
	
}
