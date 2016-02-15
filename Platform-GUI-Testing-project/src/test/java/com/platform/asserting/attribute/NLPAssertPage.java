/**
 * 
 */
package com.platform.asserting.attribute;

/**
 * @author pandey
 *
 */
public class NLPAssertPage {
	
	
	private static final String lidResponseValue="detectedLanguages";
	private static final String textForParagraph="Bodies from the MH17 crash are being kept on this train, as Natalia Antelava reports\n"+
"ベリリウムは原子番号4の元素。元素記号は Be。第2族元素に属し、原子量は約9.012である\n"+
"Le palais des beaux-arts de Lille est un musée municipal d'art et d'antiquités situé place de la République à Lille.";
	
	private static final String LidparagraphValue="paragraphs";

	public static String getLidparagraphvalue() {
		return LidparagraphValue;
	}

	public static String getTextforparagraph() {
		return textForParagraph;
	}

	public static String getLidresponsevalue() {
		return lidResponseValue;
	}

}
