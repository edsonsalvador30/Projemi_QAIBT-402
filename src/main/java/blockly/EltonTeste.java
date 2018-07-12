package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EltonTeste {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// EltonTeste
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
						Var.valueOf("select u from User u"));
				return cronapi.database.Operations.getField(item, Var.VAR_NULL);
			}
		}.call();
	}

}
