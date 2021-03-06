package cookie;

public class FortuneĞ¡ookieController {

    private final FortuneCookieFactory fortuneCookieFactory;

    public FortuneĞ¡ookieController(FortuneCookieFactory fortuneCookieFactory) {
        this.fortuneCookieFactory = fortuneCookieFactory;
    }

    public FortuneCookie tellFortune() {
        return this.fortuneCookieFactory.bakeFortuneCookie();
    }
}