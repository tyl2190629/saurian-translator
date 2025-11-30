public class Saurian
{
  private String english;
  private String saurian;

  public static final char[] ENGLISHARR =
	{ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'N', 'O',
'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
'l', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
  public static final char[] SAURIANARR =
	{ 'U', 'R', 'S', 'T', 'O', 'V', 'W', 'X', 'A', 'Z', 'B', 'C', 'D', 'E',
'F', 'G', 'H', 'J', 'K', 'I', 'L', 'N', 'P', 'O', 'Q', 'u', 'r', 's', 't', 'o', 'v', 'w', 'x', 'a', 'z', 'b',
'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'i', 'l', 'n', 'p', 'o', 'q' };
  public static final int ARRLENGTH = ENGLISHARR.length;


  public Saurian ()
  {
	this.english = "";
	this.saurian = "";
  }


  public Saurian (String phrase, boolean isEnglish)
  {
	if (isEnglish)
	  {
		setEnglish (phrase);
	  }
	else
	  {
		setSaurian (phrase);
	  }
  }

  public String getEnglish ()
  {
	return english;
  }

  public void setEnglish (String english)
  {
	this.english = english;
	translateEngToSaur (english);
  }

  public String getSaurian ()
  {
	return saurian;
  }

  public void setSaurian (String saurian)
  {
	this.saurian = saurian;
	translateSaurToEng (saurian);
  }

  private void translateEngToSaur (String englishToSaur)
  {
	char[] engArr = englishToSaur.toCharArray ();
	StringBuilder saurianBuilder = new StringBuilder ();

  for (char ch:engArr)
	  {
		int index = indexOf (ENGLISHARR, ch);
		if (index != -1)
		  {
			saurianBuilder.append (SAURIANARR[index]);
		  }
		else
		  {
			saurianBuilder.append (ch);
		  }
	  }

	this.saurian = saurianBuilder.toString ();
  }

  private void translateSaurToEng (String saurianToEnglish)
  {
	char[] saurArr = saurianToEnglish.toCharArray ();
	StringBuilder englishBuilder = new StringBuilder ();

  for (char ch:saurArr)
	  {
		int index = indexOf (SAURIANARR, ch);
		if (index != -1)
		  {
			englishBuilder.append (ENGLISHARR[index]);
		  }
		else
		  {
			englishBuilder.append (ch);
		  }
	  }

	this.english = englishBuilder.toString ();
  }

  private int indexOf (char[]arr, char ch)
  {
	for (int i = 0; i < arr.length; i++)
	  {
		if (arr[i] == ch)
		  {
			return i;
		  }
	  }
	return -1;
  }

  @Override public String toString ()
  {
	return "English translation:\n" + english + "\nSaurian translation:\n" +
	  saurian;
  }
}
