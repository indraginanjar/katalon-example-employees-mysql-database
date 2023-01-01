import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.sql.DriverManager as DriverManager
import java.sql.ResultSet as ResultSet
import java.sql.Statement as Statement
import java.sql.Connection as Connection
import com.kms.katalon.util.CryptoUtil
import com.kms.katalon.util.CryptoUtil.CrytoInfo

String databaseUrl = "jdbc:mysql://$GlobalVariable.databaseAddress:$GlobalVariable.databasePort/$GlobalVariable.databaseSchemaName"

CrytoInfo info = CryptoUtil.getDefault(GlobalVariable.databaseEncryptedPassword)

String plainTextPassword = CryptoUtil.decode(info)

Connection databaseConnection = DriverManager.getConnection(databaseUrl, GlobalVariable.databaseUser, plainTextPassword)

Statement sqlStatement = databaseConnection.createStatement()

String employeeQuery = "SELECT `birth_date` FROM `employees` WHERE emp_no=500000"

ResultSet employeeResultSet = sqlStatement.executeQuery(employeeQuery)

employeeResultSet.next()

String retrievedBirthDate = employeeResultSet.getString('birth_date')

WS.verifyMatch(retrievedBirthDate, birthDate, false)
