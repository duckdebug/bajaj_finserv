describe('testcase3',()=>{
    it('visit Travel Look',()=>{
        cy.visit('https://www.travolook.in/');
    })
    it('login',()=>{
        var email = 'uni@gmail.com';
        var password = 'uni1234';
        cy.get('#login_top1').click();
        cy.get('#txtloginemail').type(email);
        cy.get('#txtloginpassword').type(password);
        cy.get('#login > input.btn_yellow').click();
        cy.wait(500);
    })

    it('select round trip',()=>{
        cy.get('.roundway').click();
        cy.get('#flying_from_N').click();
        cy.get('#flying_from').clear();
        cy.get('#flying_from').type('Chandigarh');
        cy.get('.ac_over').click();
        cy.get('#flying_to_N').click();
        cy.get('#flying_to').clear();
        cy.wait(500);
        cy.get('#flying_to').type('Pune{enter}');
        cy.wait(500);
    })
    it('select depature date',()=>{
        cy.get('.ui-datepicker-group-first > .ui-datepicker-calendar > tbody > :nth-child(5) > :nth-child(3) > .ui-state-default').click({force: true});
        
    })
    it('click search',()=>{
        cy.get('#searchengine_btn').click();
    })

})

