import gnu.expr.ModuleMethod;
import gnu.mapping.Procedure;
import gnu.mapping.Procedure2;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * User: dkvasnicka
 * Date: 8/26/13
 * Time: 12:50
 */
public class KawaSpark {

    public static final Procedure get = new Procedure2() {
        @Override
        public Object apply2(Object path, final Object handler) throws Throwable {
            Spark.get(new Route(path.toString()) {
                @Override
                public Object handle(Request request, Response response) {
                    try {
                        return ((ModuleMethod) handler).apply2(request, response);
                    } catch (Throwable throwable) {
                        throw new RuntimeException(throwable);
                    }
                }
            });

            return null;
        }
    };
}
