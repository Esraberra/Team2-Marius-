from selenium import webdriver
from selenium.webdriver.common.by import By
from time import sleep
import logging


logging.basicConfig(level=logging.DEBUG)

def test_pytest1():

    driver = webdriver.Chrome()

    driver.get('http://localhost:3131/dropdown-menu-form.jsp') # URL wird mithilfe Live Server generiert
    logging.info("Open autmationpractice")

    element = driver.find_element(By.ID, "activity")
    element.click()
    logging.info("Click on dropdowm 1")

    element = driver.find_element(By.XPATH, '//*[@id="activity"]/option[2]')
    element.click()
    logging.info("Choice 1")

    element = driver.find_element(By.ID, "wetter")
    element.click()
    logging.info("Click on dropdowm 2")

    element = driver.find_element(By.XPATH, '//*[@id="wetter"]/option[2]')
    element.click()
    logging.info("Choice 2")

    element = driver.find_element(By.ID, "kosten").send_keys("10")
    logging.info("Input")

    element = driver.find_element(By.ID, "submitButton")
    element.click()
    logging.info("Submited")

    element = driver.find_element(By.ID, "output")


def test_pytest2():

    driver = webdriver.Chrome()

    driver.get('http://localhost:3131/dropdown-menu-form.jsp') # URL wird mithilfe Live Server generiert
    logging.info("Open autmationpractice")

    element = driver.find_element(By.ID, "activity")
    element.click()
    logging.info("Click on dropdowm 1")

    element = driver.find_element(By.XPATH, '//*[@id="activity"]/option[3]')
    element.click()
    logging.info("Choice 1")

    element = driver.find_element(By.ID, "wetter")
    element.click()
    logging.info("Click on dropdowm 2")

    element = driver.find_element(By.XPATH, '//*[@id="wetter"]/option[3]')
    element.click()
    logging.info("Choice 2")

    element = driver.find_element(By.ID, "kosten").send_keys("20")
    logging.info("Input")

    element = driver.find_element(By.ID, "submitButton")
    element.click()
    logging.info("Submited")

##    element = driver.find_element(By.ID, "output")
##    assert "GoKart" == element.text

def test_pytest3():

    driver = webdriver.Chrome()


    driver.get('http://localhost:3131/dropdown-menu-form.jsp') # URL wird mithilfe Live Server generiert
    driver.maximize_window()
    logging.info("Open autmationpractice")

    element = driver.find_element(By.ID, "activity")
    element.click()
    logging.info("Click on dropdowm 1")

    element = driver.find_element(By.XPATH, '//*[@id="activity"]/option[4]')
    element.click()
    logging.info("Choice 1")

    element = driver.find_element(By.ID, "wetter")
    element.click()
    logging.info("Click on dropdowm 2")

    element = driver.find_element(By.XPATH, '//*[@id="wetter"]/option[4]')
    element.click()
    logging.info("Choice 2")

    element = driver.find_element(By.ID, "kosten").send_keys("30")
    logging.info("Input")

    element = driver.find_element(By.ID, "submitButton")
    element.click()
    logging.info("Submited")

    element = driver.find_element(By.ID, "output")
    assert "Theater" == element.text


