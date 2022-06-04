describe('Testcase3',()=>{
    it('Test case 3',()=>{
        cy.visit('https://www.makemytrip.com/')
        // Url Not working 
        cy.get('#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > ul > li.makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut > div > p').click();
        cy.get('#username').click().type('uni@gmail.com');
        cy.get('#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25 > button').click();
        cy.get('#password').click().type('uni123');
        cy.get('#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25 > button')
        cy.get('#root > div > div.minContainer > div > div > div.makeFlex > ul > li.selected').click();
        cy.get('#root > div > div.minContainer > div > div > div.fsw > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchCity.inactiveWidget > label > span').click();
        // cy.get('#root > div > div.minContainer > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input').click().type(Chandigarh, options)

    })
})