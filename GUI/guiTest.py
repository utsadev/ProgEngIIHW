''''''
from wx.core import *
#import demo

#class CalcFrame(demo.MyFrame1):
#
#    def __init__(self, parent):
#        demo.MyFrame.__init__(self, parent)
#
#    def FindSquare(self, event):
#        num = int(self.m_textCtrl1.GetValue())
#        self.m_textCtrl2.SetValue(str(num*num))
#
#
#app = wx.App(False)
#frame = CalcFrame(None)
#frame.Show(True)
#
#app.MainLoop()

app = wx.App()
window = wx.Frame(None, title="wxPython Frame", size = (300, 200))
panel = wx.Panel(window)
label = wx.StaticText(panel, label = "Hello World", pos=(100,50))
window.Show(True)
app.MainLoop()