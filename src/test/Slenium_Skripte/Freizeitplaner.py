from selenium import webdriver
from time import sleep

driver = webdriver.Chrome()

driver.get('http://localhost:3131/dropdown-menu-form.jsp') # URL wird mithilfe Live Server generiert

element = driver.find_element_by_id("activity")
element.click()
sleep(2)

element = driver.find_element_by_xpath('//*[@id="activity"]/option[2]')
element.click()
sleep(2)

##element = driver.find_element_by_xpath('//*[@id="activity"]/option[3]')
##element.click()
##sleep(2)
##
##element = driver.find_element_by_xpath('//*[@id="activity"]/option[4]')
##element.click()
##sleep(2)

element = driver.find_element_by_id("wetter")
element.click()
sleep(2)

element = driver.find_element_by_xpath('//*[@id="wetter"]/option[2]')
element.click()
sleep(2)

##element = driver.find_element_by_xpath('//*[@id="wetter"]/option[3]')
##element.click()
##sleep(2)
##
##element = driver.find_element_by_xpath('//*[@id="wetter"]/option[4]')
##element.click()
##sleep(2)

element = driver.find_element_by_id("kosten").send_keys("10")
sleep(2)

element = driver.find_element_by_id("submitButton")
element.click()
##
##sleep(2)
##
##driver.maximize_window()
##sleep(2)
##driver.refresh()
##sleep(2)
##
##driver.get("http://www.sogeti.com")
##sleep(2)
##driver.back()
##sleep(2)

driver.quit()
