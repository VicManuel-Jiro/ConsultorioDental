package Control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCorreo
{
  public boolean Valida(String email)
  {
    Pattern pattern = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
    Matcher matcher = pattern.matcher(email);
    if (matcher.find() == true) {
      return true;
    }
    return false;
  }
}
