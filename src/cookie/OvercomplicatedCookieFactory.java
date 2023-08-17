package cookie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OvercomplicatedCookieFactory {
    private int cookiesCreated = 0;
    private final ArrayList<String> positiveTexts;
    private final ArrayList<String> negativeTexts;
    private final boolean isPositive;

    /** Класс Random возвращает «псевдо-случайные» числа. Здесь он используется, чтобы возвращать случайное предсказание
     * из списка, а не конкретное.  */
    private final Random rnd = new Random();

    public OvercomplicatedCookieFactory(
        ArrayList<String> positiveTexts,
        ArrayList<String> negativeTexts,
        boolean isPositive
    ) {
        this.positiveTexts = positiveTexts;
        this.negativeTexts = negativeTexts;
        this.isPositive = isPositive;
    }

    /** Печёт печеньку! */
    public String bakeFortuneCookie() {
        StringBuilder cookieBuilder = new StringBuilder();

        // Увеличиваем счётчик печенек
        this.incrementNumberOfCookiesCreated();

        // Возвращаем хорошее или плохое предсказание
        if (isPositive) {
            cookieBuilder.append(randomPositive());
        } else {
            cookieBuilder.append(randomNegative());
        }

        // Преобразовываем результат в строку
        return cookieBuilder.toString();
    }

    /** Возвращает количество испечённых печенек */
    public int getCookiesCreated() {
        return this.cookiesCreated;
    }

    /** Обнуляет счётчик созданных печенек */
    public void resetCookiesCreated() {
        this.cookiesCreated = 0;
    }


    /** Увеличивает счётчик испеченных печенек */
    private void incrementNumberOfCookiesCreated() {
        this.cookiesCreated++;
    }

    /** Выбирает произвольное предсказание из списка позитивных */
    private String randomPositive() {
        // Получаем целое случайное число от нуля до максимального размера массива - 1.
        int randomIndex = rnd.nextInt(positiveTexts.size());
        return positiveTexts.get(randomIndex);
    }

    /** Выбирает произвольное предсказание из списка негативных */
    private String randomNegative() {
        // Получаем целое случайное число от нуля до максимального размера массива - 1.
        int randomIndex = rnd.nextInt(negativeTexts.size());
        return negativeTexts.get(randomIndex);
    }
}

