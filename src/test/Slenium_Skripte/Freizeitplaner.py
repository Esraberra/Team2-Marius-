from selenium import webdriver
from selenium.webdriver.common.by import By
from time import sleep

driver = webdriver.Chrome()

driver.get('http://localhost:3131/dropdown-menu-form.jsp') # URL wird mithilfe Live Server generiert

element = driver.find_element(By.ID, "activity")
element.click()
sleep(2)

element = driver.find_element(By.XPATH, '//*[@id="activity"]/option[2]')
element.click()
sleep(2)

element = driver.find_element(By.ID, "wetter")
element.click()
sleep(2)

element = driver.find_element(By.XPATH, '//*[@id="wetter"]/option[2]')
element.click()
sleep(2)

element = driver.find_element(By.ID, "kosten").send_keys("10")
sleep(2)

element = driver.find_element(By.ID, "submitButton")
element.click()


## driver.quit()
