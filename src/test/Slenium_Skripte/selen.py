from selen import webdriver
from time import sleep

driver = webdriver.Chrome()

driver.get('http://127.0.0.1:5500/Plan.html') # URL wird mithilfe Live Server generiert

element = driver.find_element_by_id("type")
element.click()
sleep(2)

element = driver.find_element_by_xpath('//*[@id="type"]/option[1]')
element.click()
sleep(2)

element = driver.find_element_by_xpath('//*[@id="type"]/option[2]')
element.click()
sleep(2)

element = driver.find_element_by_xpath('//*[@id="type"]/option[3]')
element.click()
sleep(2)

element = driver.find_element_by_id("wetter")
element.click()
sleep(2)

element = driver.find_element_by_id("kosten")
element.click()
sleep(2)

element = driver.find_element_by_id("btn")
element.click()
sleep(2)

driver.maximize_window()
sleep(2)
driver.refresh()
sleep(2)

driver.get("http://www.sogeti.com")
sleep(2)
driver.back()
sleep(2)

driver.quit()