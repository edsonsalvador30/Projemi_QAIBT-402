package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class SomaValores {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param param_Entidade
	 * @return Var
	 */
	// SomaValores
	public static Var Executar(Var param_Entidade) throws Exception {
		return new Callable<Var>() {

			// param
			private Var Entidade = param_Entidade;
			// end

			public Var call() throws Exception {
				Entidade = cronapi.database.Operations.query(Var.valueOf("app.entity.Compras"),
						Var.valueOf("select SUM(c.preco) from Compras c"));
				return Entidade;
			}
		}.call();
	}

}
