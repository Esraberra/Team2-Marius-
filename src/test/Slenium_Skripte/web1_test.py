from selenium import webdriver
from selenium.webdriver.common.by import By
from time import sleep
import logging


logging.basicConfig(level=logging.DEBUG)

def test_pytest():

    driver = webdriver.Chrome()

    driver.get('http://localhost:3131/dropdown-menu-form.jsp') # URL wird mithilfe Live Server generiert
    logging.info("Open autmationpractice")

    element = driver.find_element(By.ID, "activity")
    element.click()
    logging.info("Click on dropdowm 1")
    sleep(2)

    element = driver.find_element(By.XPATH, '//*[@id="activity"]/option[2]')
    element.click()
    logging.info("Choice 1")
    sleep(2)

    element = driver.find_element(By.ID, "wetter")
    element.click()
    logging.info("Click on dropdowm 2")
    sleep(2)

    element = driver.find_element(By.XPATH, '//*[@id="wetter"]/option[2]')
    element.click()
    logging.info("Choice 2")
    sleep(2)

    element = driver.find_element(By.ID, "kosten").send_keys("10")
    logging.info("Input")
    sleep(2)

    element = driver.find_element(By.ID, "submitButton")
    element.click()
    logging.info("Submited")


    ## driver.quit()
