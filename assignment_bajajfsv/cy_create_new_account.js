describe('coding blocks',()=>{
    it('signup test case',()=>{
        cy.visit('https://www.amazon.in/');
        cy.get('#nav-link-accountList > span').trigger('mouseover');
        cy.get('#nav-signin-tooltip > div > a').click();
        cy.get('#ap_customer_name').type('Uni');
        cy.get('#ap_email').click().type('uni@gmail.com');
        cy.get('#ap_password').click().type('uni123');
        cy.get('#ap_password_check').type('uni1234');
        cy.get('#continue').click();
        
    })
})