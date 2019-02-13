package draweditor.commands;

import java.awt.Graphics;
import java.util.List;

import draweditor.DrawEditor;
import draweditor.figures.IFigure;

public class DrawCommand implements ICommand, IReversibleCommand {

    public IFigure figure;

    public DrawCommand(IFigure figure){
        this.figure = figure;
    }

    public void execute(DrawEditor draweditor) {
        //figure.draw(Graphics g);
        //Group activeGroup = draweditor.findGroup(this.activeFigure);
        List<IFigure> figures = draweditor.activeGroup.getFigures();
        figures.add(draweditor.activePosision, this.figure);
        draweditor.redraw();
        draweditor.setActiveFigure(this.figure);
    }


    public void unexecute(DrawEditor draweditor) {
        //this.delete();
    }

}