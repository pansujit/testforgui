/**
 * 
 */
package com.platform.resources.Method;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.platform.asserting.attribute.CorpusAssertPage;
import com.platform.asserting.attribute.JsonParserCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusAddCorpusSegmentTargets;
import com.platform.locators.resources.corpus.LocatorsInCorpusAddCorpusSegments;
import com.platform.locators.resources.corpus.LocatorsInCorpusAddNewCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusCorpusExist;
import com.platform.locators.resources.corpus.LocatorsInCorpusDeleteCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusDeleteCorpusSegmentTargets;
import com.platform.locators.resources.corpus.LocatorsInCorpusDetailCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusExportCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusImportCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusListCorpora;
import com.platform.locators.resources.corpus.LocatorsInCorpusListCorpusSegments;
import com.platform.locators.resources.corpus.LocatorsInCorpusUpdateCorpusProperties;
import com.platform.locators.resources.corpus.LocatorsInCorpusUpdateCorpusSegment;
import com.platform.locators.resources.corpus.LocatorsInCorpusDeleteCorpusSegments;
import com.platform.locators.resources.dictionary.LocatorsInResourcesAPI;

/**
 * Here we can find all the method that are used for test during in the corpus
 * @author pandey
 *
 */
/**
 * @author pandey
 *
 */
public class ResourcesCorpus {


	public WebDriver driver;

	public ResourcesCorpus(WebDriver ldriver){

		this.driver=ldriver;
	}



	/**
	 * This method is common for all the method listed below so we can frequently call to initialise the 
	 * our method in the "corpus"
	 * @throws InterruptedException
	 */
	public void commonInDictionay() throws InterruptedException{

		CommonInResources commoninResources=PageFactory.initElements(driver, CommonInResources.class);
		commoninResources.commonInAll();
		LocatorsInResourcesAPI locatorsinResourcesapi=PageFactory.initElements(driver, LocatorsInResourcesAPI.class);
		locatorsinResourcesapi.selectCorpus.click();
		Thread.sleep(1000);
	}

	public String[] addnewEmptyCorpus() throws InterruptedException{

		LocatorsInCorpusAddNewCorpus addnewcorpus=PageFactory.initElements(driver, LocatorsInCorpusAddNewCorpus.class);
		addnewcorpus.selectAddANewEmptyCorpus.click();
		String nameOfCorpus=CorpusAssertPage.getName();
		addnewcorpus.inputAddANewEmptyCorpusName.sendKeys(nameOfCorpus);
		addnewcorpus.inputAddANewEmptyCorpusLang.sendKeys(CorpusAssertPage.getSrclanguage());
		addnewcorpus.clickAddANewEmptyCorpusTryButton.click();
		Thread.sleep(2000);
		String[] lookUpText={addnewcorpus.getAddANewEmptyCorpusResponseBody.getText().toString(),addnewcorpus.getAddANewEmptyCorpusResponseCode.getText(),nameOfCorpus};
		return lookUpText;


	}


	/**This method will add a new corpus and return the response body and text to the calling method
	 * @return
	 * @throws InterruptedException
	 */
	public String[] corpusAddANewEmptyCorpus() throws InterruptedException{
		commonInDictionay();
		return addnewEmptyCorpus();


	}
	/**
	 * This willl delete a corpus and send the response code to the called testclass
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public String corpusDeleteCorpus() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addnewEmptyCorpus();
		Thread.sleep(1000);
		String corpusId=JsonParserCorpus.getCorpusId(lookUpText[0]);
		LocatorsInCorpusDeleteCorpus deletecorpus=PageFactory.initElements(driver, LocatorsInCorpusDeleteCorpus.class);
		deletecorpus.selectDeleteCorpus.click();
		deletecorpus.inputDeleteCorpusCorpusId.sendKeys(corpusId);
		deletecorpus.clickDeleteCorpusTryButton.click();
		Thread.sleep(2000);
		return deletecorpus.getDeleteCorpusResponseCode.getText();

	}
	/** This will add corpus and check whether it is exist or not
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusCorpusExists() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addnewEmptyCorpus();
		LocatorsInCorpusCorpusExist corpusexist=PageFactory.initElements(driver, LocatorsInCorpusCorpusExist.class);
		corpusexist.selectCorpusExist.click();
		corpusexist.inputCorpusExistName.sendKeys(lookUpText[2]);
		corpusexist.clickCorpusExistTryButton.click();
		Thread.sleep(1000);
		return ((corpusexist.getCorpusExistResponseBody.getText().toString()).contains(CorpusAssertPage.getAssertcorpusexist())
				&& corpusexist.getCorpusExistResponseCode.getText().contains(CorpusAssertPage.getAssertresponsecode()));

	}

	/**
	 * This will add corpus and assert details of that corpus
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusDetailCorpus() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addnewEmptyCorpus();
		String corpusId=JsonParserCorpus.getCorpusId(lookUpText[0]);
		LocatorsInCorpusDetailCorpus detailcorpus=PageFactory.initElements(driver, LocatorsInCorpusDetailCorpus.class);
		detailcorpus.selectDetailCorpus.click();
		detailcorpus.inputDetailCorpusCorpusId.sendKeys(corpusId);
		detailcorpus.clickDetailCorpusTryButton.click();
		Thread.sleep(1000);
		String lookUp=detailcorpus.getDetailCorpusResponseBody.getText().toString();
		String lookUpInt=detailcorpus.getDetailCorpusResponseCode.getText();
		return((lookUp.contains(CorpusAssertPage.getAssertdetailcorpus())) &&
				(lookUp.contains(CorpusAssertPage.getAssertstatus())) &&
				(lookUpInt.contains(CorpusAssertPage.getAssertresponsecode())));

	}

	public Boolean corpusUpdateCorpusProperties() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addnewEmptyCorpus();
		String corpusId=JsonParserCorpus.getCorpusId(lookUpText[0]);
		LocatorsInCorpusUpdateCorpusProperties properties=PageFactory.initElements(driver, LocatorsInCorpusUpdateCorpusProperties.class);
		properties.selectUpdateCorpusProperties.click();
		properties.inputUpdateCorpusPropertiesCorpusId.sendKeys(corpusId);
		properties.inputUpdateCorpusPropertiesName.sendKeys((CorpusAssertPage.getName()));
		properties.clickUpdateCorpusPropertiesTryButton.click();
		Thread.sleep(1000);
		String lookUp=properties.getUpdateCorpusPropertiesResponseBody.getText().toString();
		String lookUpInt=properties.getUpdateCorpusPropertiesResponseCode.getText();
		return ((lookUp.contains(CorpusAssertPage.getAssertupdatecorpus())) &&
				(lookUpInt.contains(CorpusAssertPage.getAssertresponsecode())));


	}

	/**
	 * This is the generic method for adding the segment in the corpus
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public String[] addCorpusSegments() throws InterruptedException, IOException, ParseException{

		String[] lookUpText=addnewEmptyCorpus();
		String corpusId=JsonParserCorpus.getCorpusId(lookUpText[0]);
		LocatorsInCorpusAddCorpusSegments addsegments=PageFactory.initElements(driver, LocatorsInCorpusAddCorpusSegments.class);
		addsegments.selectAddCorpusSegments.click();
		addsegments.inputAddCorpusSegmentsbody.sendKeys(String.format(CorpusAssertPage.getInputinaddcorpussegment(), corpusId));
		addsegments.clickAddCorpusSegmentsTryButton.click();
		Thread.sleep(2000);
		String[] lookUp={addsegments.getAddCorpusSegmentsResponseBody.getText().toString(),addsegments.getAddCorpusSegmentsResponseCode.getText(),corpusId};
		return lookUp;

	}

	/** This method add the corpus segment and 
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusAddCorpusSegments() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUp=addCorpusSegments();
		return (lookUp[0].contains(CorpusAssertPage.getAssertinaddcorpussegment()) && lookUp[0].contains(CorpusAssertPage.getAssertinaddcorpussegmentcomma()) &&
				lookUp[1].contains(CorpusAssertPage.getAssertresponsecode()));


	}
	/**
	 * This will delete the corpus segments from the corpus
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusDeleteCorpusSegments() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUp=addCorpusSegments();
		LocatorsInCorpusDeleteCorpusSegments deletesegment=PageFactory.initElements(driver, LocatorsInCorpusDeleteCorpusSegments.class);
		Thread.sleep(1000);
		deletesegment.selectDeleteCorpusSegment.click();
		deletesegment.inputDeleteCorpusSegmentCorpusId.sendKeys(lookUp[2].toString());
		String corpusSegId=JsonParserCorpus.getsegmentId(lookUp[0]);
		deletesegment.inputDeleteCorpusSegmentSegId.sendKeys(corpusSegId);
		deletesegment.clickDeleteCorpusSegmentTryButton.click();
		Thread.sleep(1000);
		String lookUpText=deletesegment.getDeleteCorpusSegmentResponseBody.getText().toString();
		String lookUpInt=deletesegment.getDeleteCorpusSegmentResponseCode.getText();
		return(lookUpText.contains(CorpusAssertPage.getAssertdeletesegment()) && lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));


	}
	
	/**
	 * This is the generic method which return the segment with available seg Id and corpus ID
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public String[] listCorpusSegments() throws InterruptedException, IOException, ParseException{
		String[] lookUp=addCorpusSegments();
		String CorpusId=lookUp[2];
		LocatorsInCorpusListCorpusSegments listsegments=PageFactory.initElements(driver, LocatorsInCorpusListCorpusSegments.class);
		listsegments.selectListCorpusSegments.click();
		listsegments.inputListCorpusSegmentsCorpusId.sendKeys(CorpusId);
		listsegments.clickListCorpusSegmentsTryButton.click();
		Thread.sleep(1000);
		String lookUpText=listsegments.getListCorpusSegmentsResponseBody.getText().toString();
		String lookUpInt=listsegments.getListCorpusSegmentsResponseCode.getText();
		String[] lookUpMe={lookUpText,lookUpInt,CorpusId};
		return lookUpMe;
				
	}

	public Boolean corpusListCorpusSegments() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=listCorpusSegments();
		return (lookUpText[0].contains(CorpusAssertPage.getAssertinaddcorpussegment()) && lookUpText[1].contains(CorpusAssertPage.getAssertresponsecode()));


	}

	/**
	 * This method list the all corpora available. No  filters and selectors are used
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusListCorpora() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		LocatorsInCorpusListCorpora listcorpora=PageFactory.initElements(driver, LocatorsInCorpusListCorpora.class);
		listcorpora.selectListCorpora.click();
		listcorpora.clickListCorporaTryButton.click();
		Thread.sleep(1000);
		String lookUpText=listcorpora.getListCorporaResponseBody.getText().toString();
		String lookUpInt=listcorpora.getListCorporaResponseCode.getText();
		return (lookUpText.contains(CorpusAssertPage.getAssertdetailcorpus()) && lookUpText.contains(CorpusAssertPage.getAssertlistcorpora()) 
				&& lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));

	}
	/**
	 * this method will import the corpus in bitext format
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusImportCorpus() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		LocatorsInCorpusImportCorpus importcorpus=PageFactory.initElements(driver, LocatorsInCorpusImportCorpus.class);
		importcorpus.selectImportCorpus.click();
		importcorpus.inputImportCorpusName.sendKeys(CorpusAssertPage.getName());
		importcorpus.inputImportCorpusInputFile.sendKeys(CommonInResources.fileCheck("importCorpus.txt"));
		importcorpus.selectImportCorpusFormatBiText.click();
		importcorpus.clickImportCorpusTryButton.click();
		Thread.sleep(1000);
		String lookUpText=importcorpus.getImportCorpusResponseBody.getText().toString();
		String lookUpInt=importcorpus.getImportCorpusResponseCode.getText();
		return (lookUpText.contains(CorpusAssertPage.getAssertimportcorpusfirst()) && lookUpText.contains(CorpusAssertPage.getAssertimportcorpussecond()) 
		&& lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));
		
		
		}
	/**
	 * 
	 * This method uses the corpusId , segId and source to update the segment
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusUpdateCorpusSegment() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=listCorpusSegments();
		ArrayList <String> segmentValue= new ArrayList<String>();
		segmentValue=JsonParserCorpus.getListsegmentId(lookUpText[0]);
		LocatorsInCorpusUpdateCorpusSegment updatesegment=PageFactory.initElements(driver, LocatorsInCorpusUpdateCorpusSegment.class);
		updatesegment.selectUpdateCorpusSegment.click();
		updatesegment.inputUpdateCorpusSegmentCorpusId.sendKeys(lookUpText[2].toString());
		updatesegment.inputUpdateCorpusSegmentsegId.sendKeys(segmentValue.get(0));
		updatesegment.inputUpdateCorpusSegmentSource.sendKeys(CorpusAssertPage.getListsegmentsourcetext());
		updatesegment.clickUpdateCorpusSegmentTryButton.click();
		Thread.sleep(1000);
		String lookUp=updatesegment.getUpdateCorpusSegmentResponseBody.getText().toString();
		String lookUpInt=updatesegment.getUpdateCorpusSegmentResponseCode.getText();
		return (lookUp.contains(CorpusAssertPage.getAssertupdatecorpus()) && lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));
		
		}
	
	/**
	 * This method deletes the target from the corpus segment. it will first create
	 * an empty corpus and add segment and then delete
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusDeleteCorpusSegmentTargets() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=listCorpusSegments();
		ArrayList <String> segmentValue= new ArrayList<String>();
		//segId lang targetid1 lang targetid2 lang.....
		segmentValue=JsonParserCorpus.getListsegmentId(lookUpText[0]);
		LocatorsInCorpusDeleteCorpusSegmentTargets deletesegmenttarget=PageFactory.initElements(driver, LocatorsInCorpusDeleteCorpusSegmentTargets.class);
		deletesegmenttarget.selectDeleteCorpusSegmentsTargets.click();
		deletesegmenttarget.inputDeleteCorpusSegmentsTargetsCorpusId.sendKeys(lookUpText[2].toString());
		deletesegmenttarget.inputDeleteCorpusSegmentsTargetsSegId.sendKeys(segmentValue.get(0));
		deletesegmenttarget.inputDeleteCorpusSegmentsTargetsTargetId.sendKeys(segmentValue.get(2));
		deletesegmenttarget.clickDeleteCorpusSegmentsTargetsTryButton.click();
		Thread.sleep(1000);
		String lookUp=deletesegmenttarget.getDeleteCorpusSegmentsTargetsResponseBody.getText().toString();
		String lookUpInt=deletesegmenttarget.getDeleteCorpusSegmentsTargetsResponseCode.getText();
		return (lookUp.contains(CorpusAssertPage.getAssertindeletecorpussegmenttargets()) && lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));
		
		}
	
	
	/** This method exports the corpus. it must have at least one segement to export
	 * This method will add empty corpus, add a segment and export
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusExportCorpus() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addCorpusSegments();
		LocatorsInCorpusExportCorpus exportcorpus=PageFactory.initElements(driver, LocatorsInCorpusExportCorpus.class);
		exportcorpus.selectExportCorpus.click();
		exportcorpus.inputExportCorpusCorpusId.sendKeys(lookUpText[2]);
		exportcorpus.clickExportCorpusTryButton.click();
		Thread.sleep(1000);
		String lookUp=exportcorpus.getExportCorpusResponseBody.getText().toString();
		String lookUpInt=exportcorpus.getExportCorpusResponseCode.getText();
		return (lookUp.contains(CorpusAssertPage.getAssertinexportcorpusdefault()) && lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));
	
	}
	
	/** This method exports the corpus. it must have at least one segement to export
	 * This method will add empty corpus, add a segment and export with plain/bitext format
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusExportCorpusFormatBitext() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addCorpusSegments();
		LocatorsInCorpusExportCorpus exportcorpus=PageFactory.initElements(driver, LocatorsInCorpusExportCorpus.class);
		exportcorpus.selectExportCorpus.click();
		exportcorpus.inputExportCorpusCorpusId.sendKeys(lookUpText[2]);
		exportcorpus.selectExportCorpusFormatTextBytext.click();
		exportcorpus.clickExportCorpusTryButton.click();
		Thread.sleep(1000);
		String lookUp=exportcorpus.getExportCorpusResponseBody.getText().toString();
		String lookUpInt=exportcorpus.getExportCorpusResponseCode.getText();
		return (lookUp.contains(CorpusAssertPage.getAssertinexportcorpusbitext()) && lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));
	
	}
	
	public Boolean corpusAddCorpusSegmentTargets() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addCorpusSegments();
		String corpusSegId=JsonParserCorpus.getsegmentId(lookUpText[0]);
		LocatorsInCorpusAddCorpusSegmentTargets segmenttargets=PageFactory.initElements(driver, LocatorsInCorpusAddCorpusSegmentTargets.class);
		segmenttargets.selectAddCorpusSegmentTargets.click();
		segmenttargets.inputAddCorpusSegmentTargetsBody.sendKeys(String.format(CorpusAssertPage.getInputinaddcorpussegmenttarget(),lookUpText[2],corpusSegId,"en","en"));
		segmenttargets.clickAddCorpusSegmentTargetsTryButton.click();
		Thread.sleep(1000);
		
		String lookUp=segmenttargets.getAddCorpusSegmentTargetsResponseBody.getText().toString();
		String lookUpInt=segmenttargets.getAddCorpusSegmentTargetsResponseCode.getText();
		return (lookUp.contains(CorpusAssertPage.getAssertinaddcorpussegmenttarget()) && lookUpInt.contains(CorpusAssertPage.getAssertresponsecode()));
	
	}
	
	

	





}
